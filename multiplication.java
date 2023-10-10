package matrix;

import java.util.Scanner;
public class multiplication {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
int i,j,k;
 System.out.println("enter number of row one");
int row1=sc.nextInt();
 System.out.println("enter number of colum one");
int colum1=sc.nextInt();
int[][]matrix1=new int [row1][colum1];

 System.out.println("enter the numbers in 1st matrix");
      for(i=0;i<row1;i++){
	    for(j=0;j<colum1;j++){
				matrix1[i][j]=sc.nextInt();
		 }
  }
 System.out.println("first  matrix is");
     for(i=0;i<row1;i++){
	   for(j=0;j<colum1;j++){
				System.out.print(matrix1[i][j]+"");
			}
	System.out.println();
  }

 System.out.println("enter number of row two ");
int row2=sc.nextInt();
 System.out.println("enter number of colum two");
int colum2=sc.nextInt();
int[][]matrix2=new int [row2][colum2];
int[][]matrix3=new int [row1][colum2];	
 System.out.println("enter the numbers in 2nd matrix");
     for(i=0 ;i<row2;i++){
	  for(j=0;j<colum2;j++){
				matrix2[i][j]=sc.nextInt();
			}
    }
 System.out.println("2nd  matrix is");
    for(i=0;i<row2;i++){
	  for(j=0;j<colum2;j++)
			{
				System.out.print(matrix2[i][j]+"\t");
			}
	System.out.println();
}
if(colum1==row2) {
	
	
   for(i=0;i<row1;i++){
	for(j=0;j<colum2;j++){

		  matrix3[i][j]=0;
	   
		  for( k=0;k<colum1;k++){
				
					matrix3[i][j]=matrix3[i][j]+matrix1[i][k]*matrix2[k][j];
				}
	        }
        }
	


for(i=0;i<row1;i++){
	for(j=0;j<colum2;j++){
				
				System.out.print(matrix3[i][j]+"\t");
			 }
 System.out.println();
          }
        }
else {
	System.out.println("multiplication is not possible");
    }
  }  
}
