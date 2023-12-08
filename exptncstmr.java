package prjjava;
import java.util.Scanner;
public class exptncstmr {
	public static void main(String[] args) {
		ByZero divByZeroException = new ByZero ("Division By Zero");
		Scanner sc = new Scanner(System.in);
		char ch='y';
		int firstNumber, secondNumber;
		System.out.println("Program to perform division");
		while(ch=='y') {
			System.out.print("Enter Number-1:");
			firstNumber=sc.nextInt();
			System.out.print("Enter Number-2:");
			secondNumber=sc.nextInt();
			try {
				if (firstNumber==0 || secondNumber==0) {
					throw divByZeroException;
				}
				else {
					int result=firstNumber/secondNumber;
					System.out.println("Result="+result);
				}
			}
			catch(ByZero e) {
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("End of operation");
				System.out.println("Do you want to continue?(y/n)");
				ch=sc.next().charAt(0);
			}
		}
	}
}
class ByZero extends Exception {
	ByZero (String str) {
		super(str);
	}
}