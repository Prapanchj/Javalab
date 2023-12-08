package prjjava;

import java.util.LinkedList;
import java.util.Scanner;
class DoublyLInkedList<T>{
	private LinkedList<T>list = new LinkedList<>();
	public void insertionAtEnd(T element) {
		list.addLast(element);
	}
	public void insertionAtFront (T element) {
		list.addFirst(element);
	}
	public void insertionAtAnyPosition (int index, T element) {
		list.add(index,element);
	}
	public void removeAtAnyPosition(int index) {
		list.remove(index);
	}
	public void display() {
		for(T element : list) {
			System.out.println(element +" ");
		}
		System.out.println( );
	}
}


public class Doublellst {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLInkedList<Integer>doublyLInkedList = new DoublyLInkedList<>();
		boolean condition = true;
		while(condition) {
			System.out.println("Enter your choice\n"+"1.Insertion at Front\n"+ "2.Insertion at End\n"+"3.Insertion at any position\n"+"4.Deletion at any Position\n"+"5. Display\n"+"6.Exit\n");
		int choice = sc.nextInt();
		int element,position;
		switch(choice) {
		case 1:
			System.out.println("Enter the element:");
			 element = sc.nextInt();
			doublyLInkedList.insertionAtFront(element);
			break;
		
		case 2:
			System.out.println("Enter the element:");
			 element = sc.nextInt();
			doublyLInkedList.insertionAtEnd(element);
			break;	
		
		case 3:
			System.out.println("Enter the element:");
			 element = sc.nextInt();
			System.out.println("Enter the position:");
			 position = sc.nextInt();
			doublyLInkedList.insertionAtAnyPosition(position,element);
			break;
		case 4:
			
			System.out.println("Enter the position:");
			 position = sc.nextInt();
			doublyLInkedList.removeAtAnyPosition(position);
			break;
			
		case 5:
			System.out.println("The elements are :");
			doublyLInkedList.display();
			break;
		
		case 6:
			condition = false;
			break;
		default :
			System.out.println("Invalid choice");
			
			 
			
		}
		}
	}

}