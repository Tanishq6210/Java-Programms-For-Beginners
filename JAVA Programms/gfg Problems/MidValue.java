package geeksForGeeks;

import java.util.Scanner;

public class MidValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number of test cases");
		int t = sc.nextInt();
		
		while(t-- >0) {
			
			System.out.println("Enter th enumber of elements you want to enter");
			int n = sc.nextInt();
			int arr[] = new int [n];
			
			
			int index;
			for(int i =0 ; i< n; i++) {
				arr[i] = sc.nextInt();
				}
				if(n==1) System.out.println(arr[0]);
				for(int i = 0; i <n ; i++) {
					index = i;
					for(int j = i ; j< n ; j++) {
						if(arr[j] < arr[index])
							index = j;
					}
					int temp = arr[i];
					arr[i] = arr[index];
					arr[index] = temp;
			  }
			if(n>1) {
				if(n%2 == 0) {
			
				int a = arr[(n/2)-1];
				System.out.println(a);
			}
			else {
				int b;
			b= arr[n/2 -1];
			System.out.println(b);
			}
			}
		}
		}
	

}
