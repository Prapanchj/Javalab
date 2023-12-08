package prjjava;
import java.util.Random;
class NumberManager {
	private int randomNumber;
	private boolean randCheck=false;
	public synchronized void generateNumber() {
		randomNumber=new Random().nextInt(10)+1;
		System.out.println("Generated Random Number is:"+randomNumber);
		randCheck=true;
		notifyAll();
	}
	public synchronized void printEvenNumbers() throws InterruptedException {
		while(!randCheck||randomNumber%2!=0) {
			wait();
		}
	System.out.println("squre of even numbers:");
		 for(int i=2;i<=randomNumber;i+=2) {
			 System.out.print((i*i)+" ");
		 }
		 randCheck=false;
		 System.out.println();
	}
    public synchronized void printOddNumbers() throws InterruptedException {
	while(!randCheck||randomNumber%2==0) {
		wait();
	}
	System.out.println("cube of odd number:");
	 for(int i=1;i<=randomNumber;i+=2) {
		 System.out.print((i*i*i)+" ");
	 }
	 randCheck=false;
	 System.out.println();
   }
}

class NumberGenerator extends Thread {
	NumberManager obj;
	public NumberGenerator(NumberManager obj) {
		this.obj=obj;
	}
	public void run() {
		while(true) {
		obj.generateNumber();
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
   }
}




class EvenPrinterThread extends Thread {
	NumberManager obj;
	public EvenPrinterThread(NumberManager obj) {
		this.obj=obj;
	}
	public void run() {
		while(true) {
			try {
			obj.printEvenNumbers();
		   }
			catch(InterruptedException e) {
				e.printStackTrace();
		   }
		}
	}
}





class OddPrinterThread extends Thread {
	NumberManager obj;
	public OddPrinterThread(NumberManager obj) {
		this.obj=obj;
	}
	public void run() {
		while(true) {
			try {
			obj.printOddNumbers();
		   }
			catch(InterruptedException e) {
				e.printStackTrace();
		   }
		}
	}
}

public class threads {
	public static void main(String []args) {
		NumberManager obj=new NumberManager();
		NumberGenerator ob1=new NumberGenerator(obj);
		EvenPrinterThread obj3=new EvenPrinterThread(obj);
		OddPrinterThread obj4=new OddPrinterThread(obj);
		ob1.start();
		obj3.start();
		obj4.start();
	}
}
	
	
	


