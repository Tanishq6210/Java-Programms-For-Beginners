package forLoop;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no u want to check for prime");
		int a = sc.nextInt();
        int result = 0;
		if (a<2) result = 1;
        for(int i = 2; i*i < a; i++) {
        	
        	if(a%i==0) ++result;
            break;  
        }
            if (result==0)
        	System.out.println("Yes the no. is prime");
        
	
        else {
        	System.out.println("No the no. is not prime");
        }
	}

}
