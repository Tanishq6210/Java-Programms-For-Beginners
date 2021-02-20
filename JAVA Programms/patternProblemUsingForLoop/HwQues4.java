package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows u wnt to print of this series");
		int n = sc. nextInt();
		
         for(int j = 1; j<=n; j++) {
        	if(j<=n/2	) {
        		for(int i = 1; i<=4-j  ; i++) {
        			System.out.print("  ");	
        		}
        		for(int i = 1; i<=j; i++) {	
        			System.out.print("* ");
        		}
        	System.out.println();
        	}
        	
        	else  {
        		for (int i = 1; i<=j-4; i++) {
        			System.out.print("  ");
        		}
                 for(int i = 1; i<=n-j+1; i++) {        	
                	 System.out.print("* ");
                 }
        	System.out.println();
        	}
         }
	}

}
