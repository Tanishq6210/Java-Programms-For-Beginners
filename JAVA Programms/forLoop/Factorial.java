package forLoop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter the no. whose factorial u wnt to find");
	int n = sc.nextInt();
	int factorial = 1;
	for(int i=0;i<=n-1;i++) {
		factorial *= n-i;
	}
	System.out.println("factorial of your no. is" + factorial);
    
	}

}
