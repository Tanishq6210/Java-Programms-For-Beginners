package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the no of rows u wnt to print of the series");
	     int n = sc.nextInt();
	     
	        for (int j =1; j<=n; j++) {
	        	for(int i =1 ; i<=j-1 ; i++) {
	        		System.out.print("    ");
	        	}
	        	for(int i=1; i<=n-j+1;i++) {
	        		System.out.print("* ");
	        		}
	        	System.out.println();
	        }

	}

}
