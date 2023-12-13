package prjjava;




import java.util.Scanner;
public class bank {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		InvalidAmountException amountException = new InvalidAmountException("Invalid Amount");
		InsufficientFundsExceptions fundsException = new InsufficientFundsExceptions("Insufficient Funds");
		System.out.println("* Banking System Application *");
		System.out.println("Enter number of customers:");
		int noOfCustomers=sc.nextInt();
		Customer[] obj = new Customer[noOfCustomers];
		for (int i=0; i<noOfCustomers; i++) {
			System.out.println("*Enter Customer Details*");
			obj[i] = new Customer();
			obj[i].setCustomerDetails();
		}
		int choice=0,i=0;
		do {
			System.out.println("1.Display all account details");
			System.out.println("2.Search by account number");
			System.out.println("3.Deposit the amount");
			System.out.println("4.Withdraw the amount");
			System.out.println("5.Exit");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				for (i=0; i<noOfCustomers; i++) {
					System.out.println("Customer No."+(i+1));
					obj[i].getCustomerDetails();
				}
				break;
			case 2:
				System.out.println("Enter Account Number:");
				int searchNumber=sc.nextInt();
				for (i=0; i<noOfCustomers; i++) {
					if (searchNumber==obj[i].accountNumber) {
						obj[i].getCustomerDetails();
						break;
					}
					else if (i==noOfCustomers-1) {
						System.out.println("*Invalid Account No.*");
					}
					else {
						continue;
					}
				}
				break;
			case 3:
				System.out.println("Enter Account Number:");
				searchNumber=sc.nextInt();
				try {
					System.out.println("Enter Amount to deposit:");
					int depositAmount = sc.nextInt();
					if (depositAmount<=0) {
						throw amountException;
					}
					else {
						for (i=0; i<noOfCustomers; i++) {
							if (searchNumber==obj[i].accountNumber) {
								obj[i].accountBalance+=depositAmount;
								obj[i].getCustomerDetails();
							}
							else if (i==noOfCustomers-1) {
								System.out.println("*Invalid Account No.*");
							}
							else {
								continue;
							}
						}
					}
				}
				catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter Account Number:");
				searchNumber=sc.nextInt();
				try {
					System.out.println("Enter Amount to withdraw:");
					int withdrawlAmount = sc.nextInt();
					if (withdrawlAmount<=0) {
						throw amountException;
					}
					else {
						for (i=0; i<noOfCustomers; i++) {
							if (searchNumber==obj[i].accountNumber) {
								if (withdrawlAmount>obj[i].accountBalance) {
									throw fundsException;
								}
								else {
									obj[i].accountBalance-=withdrawlAmount;
									obj[i].getCustomerDetails();
								}
								break;
							}
							else if (i==noOfCustomers-1) {
								System.out.println("*Invalid Account No.*");
							}
							else {
								continue;
							}
						}
					}
				}
				catch (InvalidAmountException e){
					System.out.println(e.getMessage());
				}
				catch (InsufficientFundsExceptions e){
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.println("**********");
				System.out.println(" Thank You ");
				System.out.println("**********");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while (choice<5);
	}
}

class Customer {
	int accountNumber;
	String accountType;
	String customerName;
	int accountBalance;
	Scanner sc = new Scanner(System.in);
	public void setCustomerDetails() {
		System.out.println("Enter Account number:");
		accountNumber=sc.nextInt();
		System.out.println("Enter Account type:");
		accountType=sc.next();
		System.out.println("Enter Customer name:");
		customerName=sc.next();
		System.out.println("Enter Account opening balance:");
		accountBalance=sc.nextInt();
	}
	public void getCustomerDetails() {
		System.out.println("**-CUSTOMER DETAILS-**");
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: " + accountType);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account Balance: " + accountBalance);
		System.out.println("************************");
	}
}

class InvalidAmountException extends Exception {
	InvalidAmountException(String str) {
		super(str);
	}
}

class InsufficientFundsExceptions extends Exception {
	InsufficientFundsExceptions(String str) {
		super(str);
	}
}
