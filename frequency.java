/************************************************************************************
 * File         :Frequency.java
 * Author       :prapanch j
 * Description  :Java Program to Find Count of an Alphabet in a String
 * Version      :1.0
 * Date         :03/10/23
 ***********************************************************************************/
import java.util.Scanner;

public class frequency {
	public static void main(String[]args) {
		String line;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		line=sc.nextLine();
		System.out.println("Enter the character to be Searched");
		char character=sc.next().charAt(0);
		int Frequency=Freq(line,character);
		if(Frequency==0){
			System.out.println("The Character is not present in the String");
		}
		else {
		System.out.println("Frequency is "+Frequency);
		}
	}
		static  int Freq(String line,char character) {
			char[] CharArray= line.toCharArray();
			int Strlength=line.length(),count=0;
		    for(int i=0;i<Strlength;i++){
		    	if(CharArray[i]==character)
		    	{
		    		count++;		    				
		    	}
		    }
		    return count;
		}
}

		    


