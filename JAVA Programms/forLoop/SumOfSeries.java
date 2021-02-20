package forLoop;
import java.util.Scanner;
public class SumOfSeries {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter till how many term u want to find the sum");
			int n = sc.nextInt();
			float sum = 0;
			for(int  i= 1; i<=n ; i++) {
				sum = sum + (float)1/i ;
			}
              System.out.println("The sum is ");
              System.out.println(sum);
	
		
	
	
  }
}
