/************************************************************************************
 * File         :Employee detail.java
 * Author       :prapanch j
 * Description  :Java Program to Implement Inheritance for Employee
 * Version      :1.0
 * Date         :17/10/23
 ***********************************************************************************/
package employe;
import java.util.Scanner;
public class detail {

public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  Employee employee=new Employee();
detail object =new detail();
officer of=new officer();
System.out.println("enter officer details");
of.setDetails();
of.setspecialization();
of.getDetails();
of.getspecialization();
manager ma=new manager();
System.out.println("enter manager details");
ma.setDetails();
ma.setdepartment();
ma.getDetails();
ma.getdepartment();
}
}



class Employee {
	Scanner sc=new Scanner(System.in);
			String name,address;
	int age,salary;
    long phoneNumber ;
	public void setDetails() {
    	 System.out.println("name");
     name=sc.next();
     System.out.println("address");
     sc.nextLine();
     address=sc.nextLine();
     System.out.println("age");
     age=sc.nextInt();
     System.out.println("phone number");
     phoneNumber=sc.nextLong();
     System.out.println("salary");
     salary=sc.nextInt();
 
     }
     public void getDetails(){
     System.out.println("details of employe");
     System.out.println("name"+name);
     System.out.println("address"+address);
     System.out.println("age is"+age);
     
     }   
     }
     
class officer extends Employee{
	String specialization;
	Scanner sc=new Scanner (System.in);
	void setspecialization() {
		System.out.println("enter the specialization");
		specialization=sc.next();
		
	}
	void getspecialization() {
		System.out.println("specialization="+specialization);
		
	}}
class manager extends Employee{
	String depeartment;
	
	Scanner sc=new Scanner (System.in);
	void setdepartment() {
		System.out.println("enter the depeartment");
		depeartment=sc.next();
		
}
	void getdepartment() {
		System.out.println(" the depeartment is "+depeartment);
}
}

