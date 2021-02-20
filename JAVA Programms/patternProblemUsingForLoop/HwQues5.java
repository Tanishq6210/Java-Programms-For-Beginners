package patternProblemUsingForLoop;

import java.util.Scanner;

public class HwQues5 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     
    for (int j = 1; j<=n ; j++) 
     {	   
    	for(int i = 1 ; i<=n-j+1; i++)
    		System.out.print("*");
    	for(int i = 1 ; i<=j ; i++)
    		System.out.print("  ");
    	for(int i = 1; i<=n-j+1; i++)
    		System.out.print("*");
      System.out.println();
     }System.out.println();
   for(int j=1; j<=n; j++)
     {
	   for(int i = 1; i<=j ; i++)
		   System.out.print("*");
	   for(int i =1 ; i<=n-j+1; i++)
		   System.out.print("  ");
	   for(int i =1 ; i<=j ; i++)
		   System.out.print("*");
	   System.out.println();
	   
	   
	 }  
}

}
