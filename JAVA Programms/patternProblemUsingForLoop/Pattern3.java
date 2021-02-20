package patternProblemUsingForLoop;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter how many line of this pattern u wnt to print");
		int n = sc.nextInt();
		
		for(int j= 1; j<=n; j++) {
			for(int i =1; i<=n-j+1 ; i++) {
				System.out.print("* ");
			}
		System.out.println();
		}
		
	}

}
