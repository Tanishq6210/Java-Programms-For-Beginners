package patternProblemUsingForLoop;

import java.util.Scanner;

public class AdvancePattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of line u wnt to print the series ");
		int n = sc.nextInt();
		System.out.println("*");
		for(int j =2 ; j<=n-1 ; j++) {
			System.out.print("* ");
			   for(int i=1; i<=j-2; i++) {
				   System.out.print("  ");
				   
			   }
			System.out.print("*");
			System.out.println();
	}	if (n>1)
         for(int i =1; i<=n; i++)
        	System.out.print("* ");
	}

}
