package geeksForGeeks;

import java.util.Scanner;

public class SumandAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int sum = 0;
		double average = 0.00;
		while(t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0 ; i<n ; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			average = sum/n;
			System.out.print(sum + " " + average);
		}

	}

}
