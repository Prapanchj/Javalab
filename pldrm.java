/************************************************************************************
 * File         :Palindrome.java
 * Author       :Prapanch j
 * Description  :Java Program to Check Whether a Word is Palindrome or Not
 * Version      :1.0
 * Date         :03/10/23
 ***********************************************************************************/
package palindrome;
import java.util.Scanner;
public class pldrm {
	public static void main (String[] args) {
	
		Scanner sc= new Scanner(System.in);
		String Character;
		System.out.println("Enter the string");
		Character=sc.next();
		boolean isPalindrome=Check(Character);
		if(isPalindrome==false) {
		 System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
		static  boolean Check(String Character) {
			char[] CharArray= Character.toCharArray();
			int Strlength=Character.length();
		    for(int i=0;i<Strlength/2;i++){
		    	if(CharArray[i]==CharArray[Strlength-i-1])
		    	{
		    		return false;
		    				
		    	}
		    return true;
		    	
		    }
		    return false;
		}
}
		    
		
			
	

