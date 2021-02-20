package conditionStatements;
import java .util.Scanner;
public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String result = a>b ? "a is greatr than b" : "b is greater than a ";
        System.out.println(result);
	}

}
