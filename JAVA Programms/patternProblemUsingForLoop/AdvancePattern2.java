package patternProblemUsingForLoop;

import java.util.Scanner;

public class AdvancePattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s= 1;
		int n= sc.nextInt();
		for (int j=1; j<=n ; j++) {
			for (int i =1; i<=n-j; i++) {
				System.out.print("  ");
			}
		    for (int i = 1; i<=j ; i++) {
		    	//int s=1;
		    	System.out.print(s++ +"   ");
		          
		    }
            //s++;
		    System.out.println();		
		}
	}

}
