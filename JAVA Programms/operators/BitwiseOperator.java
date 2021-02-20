package operators;
import java.util.Scanner;
public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c;
		 c = a & b;//It is a bitwise operator it works on bits
		            // see in notebook how it works
		 System.out.println(c);
		 }

}
