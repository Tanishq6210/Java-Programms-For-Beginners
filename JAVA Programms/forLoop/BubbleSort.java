package forLoop;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i=0; i<4; i++) {
			arr[i] = sc.nextInt();
		}
		
		// BUBBLE SORT
		for(int j=0; j<=2; j++) {
			for(int i=0; i<=3-j-1; i++) {
				if(arr[i+1] < arr[i]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;

				}
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}

//		for(int j=0; j<4; j++) {
//			int min = j;
//			for(int i=j+1; i<4; i++) {
//				if(min>arr[i]) {
//					min = i;
//				}
//				int temp = arr[j];
//				arr[j]=arr[min];
//				arr[min]=temp;
//			}
//		}
//		
//		for(int t: arr) {
//			System.out.println(t+ " ");
//		}
	}
	

}
