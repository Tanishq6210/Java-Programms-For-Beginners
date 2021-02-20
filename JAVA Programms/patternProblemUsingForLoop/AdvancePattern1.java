package patternProblemUsingForLoop;

import java.util.Scanner;

public class AdvancePattern1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of lines u wnt to print of this pattern");
		int n = sc.nextInt();
		
		for(int j =1 ; j<=n ; j++) {
				for (int i =1 ; i<= n-j; i++) {
					System.out.print("  ");
				}
				for(int i =1; i<=j; i++) {
					System.out.print("*   ");
				}
		System.out.println();
		}
	}

}
