package forLoop;

import java.util.Scanner;

public class TimeComplexityUsingBubbbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100000];
		for(int i=100000; i>0;i--) {
			arr[100000-i]=i;
		}
		
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		long start = System.currentTimeMillis();
		
		for(int j=0; j<=99999; j++) {
			for(int i=0; i<=99999-j-1; i++) {
				if(arr[i+1] < arr[i]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}
		}
		
		long end = System.currentTimeMillis();
		
		for(int i: arr) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		System.out.println("Time ---> "+ (end-start));

	}

}
