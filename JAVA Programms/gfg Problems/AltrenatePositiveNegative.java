package geeksForGeeks;

import java.util.Scanner;

public class AltrenatePositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0; i<n ; i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<n; i=i+2) {
				    if(arr[i]<0 && arr[i+1]>=0) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				     }
				    
				    else if(arr[i] >=0 && arr[i+1]<0) {
				    	i++;
				    	break;
				    }
			}
			for(int c : arr)
				System.out.print(c+" ");
			System.out.println();
		}

	}

}
