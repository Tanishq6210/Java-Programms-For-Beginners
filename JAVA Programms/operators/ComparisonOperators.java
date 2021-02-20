package operators;
import java.util.Scanner;
public class ComparisonOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Comparison operators are > ,< ,== ,!=,>= , <=
		System.out.println("Enter first number");
		float a = sc.nextFloat();
		System.out.println("Enter 2nd number");
		float b = sc.nextFloat();

		System.out.println(a>b);//Boolean expression return krte hai comparison  operators
		System.out.println(a!=b);//Boolean expression return krte hai comparison  operators
		System.out.println(a==b);//Boolean expression return krte hai comparison  operators
	}

}
