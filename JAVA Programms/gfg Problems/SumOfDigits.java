package geeksForGeeks;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = sc.nextInt();
		
		while(t-- > 0) {
			System.out.println("Enter the number ");
			long n = sc.nextLong();
			int sum = 0;
				while(n>0) {
					sum += n%10;
					n= n/10;
				}
				System.out.println(sum);
		}

	}

}
