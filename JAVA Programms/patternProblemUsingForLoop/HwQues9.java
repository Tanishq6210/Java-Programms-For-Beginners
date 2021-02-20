package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			int n= sc.nextInt();
//			System.out.println("*");
//			
//			for(int j =2; j<=n-1; j++)
//			{
//				System.out.print("*");------1
//				  for(int i=1; i<=j-2; i++)          FIRST PRINT PATTERN LIKE THIS
//					  System.out.print(" ");----2    THEN ADD 1SPACE IN 1,2,3
//			    System.out.print("*");					AS GIVEN IN BELOW CODE
//			    System.out.println();
//			}
//			for(int i =1; i<=n; i++)
//				System.out.print("*");----3
//			System.out.println();
			
			System.out.println("*");
			
			for(int j =2; j<=n-1; j++)
			{
				System.out.print("* ");
				  
				for(int i=1; i<=j-2; i++)
					  System.out.print("  ");
			
				  System.out.print("*");
			    System.out.println();
			}
			
			for(int i =1; i<=n; i++)
				System.out.print("* ");
			
			System.out.println();

	}

}
