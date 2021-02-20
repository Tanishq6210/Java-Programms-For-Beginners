package whileLoop;

import java.util.Scanner;

public class FindNo_Of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Method 1
		//Using  While Loop
		int i =1 , sum = 0 ;
		int temp = n ;
		while(n>0) {
			sum += n%10;
			n = n/10;
		}
		System.out.println("The sum of digits of" +temp +" is "+ sum);
		
		//Method 2
		//Using For Loop
		
		//In this we have to calculate no. of digits first as to find condition for i 
		//Where as in While loop we dont need such condition on i
		
		int NoOfDigits = (int)Math.log(temp) + 1;
		int result=0;
		for(int j =1 ; j<=NoOfDigits ; j++) {
			result += temp%10;
			temp = temp/10;
		}
		System.out.println("The sum is " +result);
	
	}	

}
