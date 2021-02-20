package forLoop;
import java.util.Scanner;
public class SeriesSum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms of tehe series");
		int n = sc.nextInt();
		float sum  = 1;
		for (int i = 2 ; i<=n ; i++) {
			if(i%2==0)
				sum -= (float)1/i;
			else
				sum += (float)1/i;
		}
        System.out.println(sum);
	}

}
