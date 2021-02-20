package patternProblemUsingForLoop;

import java.util.Scanner;

public class CombinationForPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int r = sc.nextInt();
		int a=1 ,b =1,c=1;
		int combination =1 ; 
	
			for(int i=0; i<=n-1; i++) 
				a *= n-i;
			for(int i =0; i<= n-r-1; i++)
				b *= n-r-i;
			for(int i =0; i<=r-1; i++)
				c *=  r-i;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			combination = a/(b*c);
			System.out.println("combination is " + combination);
	}

}
