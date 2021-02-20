package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();

//		int number =2;
//		for(int i =1; i <=n ; i++)
//		      System.out.print("  ");
//		      System.out.println("1");
//		
//		for (int j=2 ; j<=n; j= j +2) {
//				for(int i =1 ; i<=n-j; i++)
//					System.out.print("  ");
//				 System.out.print(number +"   ");
//				for (int i = 1; i<= j-1 ; i++)
//					System.out.print( "0   ");
//				 System.out.print(number +"   ");
//				number++;
//				 System.out.println();
//		
//		}
		int number =1;
		for(int j =1; j<=n ; j++)
	    {
	    		for(int i =1 ; i<=n-j ; i++)
	    			System.out.print("   ");
	    		System.out.print(number + "  ");
	    		if(j==1)System.out.println();
	    		for(int i=1; i<=j*2-3; i++)
	    			System.out.print("0  ");
	    		
	    		if(j>1)System.out.println(number + "  ");
	    		
	    		number++;//System.out.println();
	    }

	}

}
