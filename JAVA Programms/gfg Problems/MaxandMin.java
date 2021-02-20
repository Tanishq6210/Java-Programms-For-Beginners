package geeksForGeeks;
import java.util.Scanner;
public class MaxandMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number of test cases you want to enter");
		int t = sc.nextInt();
		int max=0 , min=0;
		
		while(t-- > 0) {
			System.out.println("Enter the number of elements in the array");
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0 ; i< n ; i++) {
				arr[i] = sc.nextInt();
				}
			
			for(int i = 0 ; i<n ; i++) {
				if(arr[min]> arr[i])
					min = i;
				if(arr[i] > arr[max])
					max = i;
			}
			System.out.print(arr[max] + " " + arr[min]);
			System.out.println();
		
		}
	}

}
