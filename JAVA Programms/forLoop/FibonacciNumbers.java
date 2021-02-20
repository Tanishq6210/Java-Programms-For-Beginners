
package forLoop;
import java.util.Scanner;
public class FibonacciNumbers {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the no. till where u wnt to continue series");
	int n= sc.nextInt();
		int a=0,b=1;
		int sum = 0;
		System.out.print(a);
		System.out.print("  ");
		System.out.print(b);
		  for( int i = 3 ; i <= n ; i++) {
			  sum = a+b;
			  System.out.print("  ");
			  System.out.print(sum);
			  a=b;
			  b=sum;
		  }
	}
}
