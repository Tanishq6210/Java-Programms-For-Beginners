package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues11PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows u wnt to print ");
		int no_Of_Rows = sc.nextInt();
		
		for(int j =1; j<= no_Of_Rows ; j++) {
			
			for(int i = 1; i<=no_Of_Rows-j; i++)
				System.out.print("  ");
			    if(j==1) 
			    	System.out.println("1");
//			    if(j>1)System.out.println();
			    if(j>1)System.out.print("1   ");
			    for(int i = 1; i<=j-2; i++)
			    {
			    	int a=1 ,b =1,c=1;
					int combination =1 ; 
				
						for(int k=0; k<=j-2; k++) 
							a *= j-1-k;
						for(int k =0; k<= j-i-2; k++)
							b *= j-1-i-k;
						for(int k =0; k<=i-1; k++)
							c *=  i-k;
//						System.out.println(a);
//						System.out.println(b);
//						System.out.println(c);
//						
						
						combination = a/(b*c);
						System.out.print(combination+ "   ");
				
			    }
			
			
			if(j>1)System.out.println("1");
			
		}

	}

}
