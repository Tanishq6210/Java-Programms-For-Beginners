package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int j =1; j<=n ; j++)
	    {
	    	for (int i = 1 ; i<=n-j; i++)
	    		System.out.print("  ");
	    	    if (j==1)System.out.println("0");
	    	for(int i =j-1; i>=1; i--)
	    		System.out.print(n-i +" ");
	    		if(j>=2)System.out.print("0 ");
	    	for(int i = 1; i<=j-1; i++)
	    		System.out.print(n-i +" ");
	    	if(j>=2)System.out.println();
	    }

	}

}
