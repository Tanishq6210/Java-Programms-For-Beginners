package geeksForGeeks;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases you want : ");
		int t = sc.nextInt();
		long sum = 0;
		while(t>0) {
		
			System.out.println("Enter the number of elements you want in the array");
			int n = sc.nextInt();
			long array[] = new long[n];
				for(int i = 0 ; i< n ; i++) {
					array[i] = sc.nextLong();
					sum += array[i];
					
				}
		t--;
		System.out.println("The sum of the array is " + sum);
		sum = 0;
		
		}

	}

}
