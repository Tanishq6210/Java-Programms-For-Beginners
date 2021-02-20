package forLoop;
import java.util.Scanner;
public class SumUsingLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the no. till which u wnt to calculate sum");
		int n=sc.nextInt();
		for(int i=0 ; i<=n ; i++) {
			 sum +=i ;
		}
         System.out.println(sum);
	}

}
