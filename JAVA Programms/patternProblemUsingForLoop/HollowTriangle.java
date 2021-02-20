package patternProblemUsingForLoop;

import java.util.Scanner;

public class HollowTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1 ; i<=n-1; i++)
			System.out.print(" ");
			System.out.println("*");
			
		for(int j=2; j<=n-1 ; j++)
		{
			for(int i =1 ; i<=n-j; i++)
				System.out.print(" ");	
			
			System.out.print("* ");
			for(int i =1; i<=j-2; i++)
				System.out.print("  ");
			System.out.print("*");
			System.out.println();
			
		}		
			for(int i=1; i<=n; i++)
				System.out.print("* ");


	}

}
