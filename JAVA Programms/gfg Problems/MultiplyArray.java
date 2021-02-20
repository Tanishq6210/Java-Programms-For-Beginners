package geeksForGeeks;

import java.util.Scanner;

public class MultiplyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases you want : ");
		int t = sc.nextInt();
		long product = 1;
		while(t>0) {
		
			System.out.println("Enter the number of elements you want in the array");
			int n = sc.nextInt();
			long array[] = new long[n];
				for(int i = 0 ; i< n ; i++) {
					array[i] = sc.nextLong();
					product *= array[i];
					
				}
		t--;
		System.out.println("The product of the array is " + product);
		}

	}

}
