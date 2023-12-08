package prjjava;


	import java.util.StringTokenizer;
	import java.util.Scanner;
	public class tokenizer {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a line of integers:");
			String str = sc.nextLine();
			StringTokenizer string = new StringTokenizer(str);
			int sum=0;
			while (string.hasMoreTokens()) {
				int num=Integer.parseInt(string.nextToken());
				sum+=num;
			}
			System.out.println("The sum is "+sum);
		}
	}

