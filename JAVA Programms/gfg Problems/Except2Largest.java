package geeksForGeeks;
import java.util.Scanner;
public class Except2Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int t = sc.nextInt();
		
		while(t-- > 0) {
			System.out.println("Enter the numbers you want to store");
			int n = sc.nextInt();
			int arr[] = new int[n];
			int index ;
			for(int i=0 ; i<n ; i++) {
				arr[i] = sc.nextInt();
				}
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
			for(int i = 0 ; i<n-2; i++)
				System.out.print(arr[i] + " ");
			    System.out.println();
		}

	}

}
