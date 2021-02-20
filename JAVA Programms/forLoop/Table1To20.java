package forLoop;

import java.util.Scanner;

public class Table1To20 {
//NESTING OF LOOP
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int print;
	 int n= sc.nextInt();
	 int m=sc.nextInt();
		for(int j=1 ; j<=n ; j++) {
			 for(int i=1 ; i<=m ; i++) {
		             
		             System.out.print(j*i+ " ");
		             
			 }
				 System.out.println();
		}
	}

}
