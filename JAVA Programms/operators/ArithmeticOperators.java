package operators;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		
		int c,d,e,f;
		//Here +,-,*,% are the arithmetic operators
		c =a+b;
		 d=a/b;
		 e=a*b;
		 f=a%b;
		 System.out.println(c);
		 System.out.println("Value of c");
		 System.out.println(d);
		 System.out.println(e);
		 System.out.print(f);
		 

	}

}
