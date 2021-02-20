package geeksForGeeks;
import java.util.Scanner;
public class LargestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int T = sc.nextInt();
		int index=0;
		while(T>0) {
			System.out.println("Enter the total number of names you want to enter");
			int n = sc.nextInt();
			String array[] = new String[n];
			System.out.println("Enter the names ");
			for(int i=0 ; i<n ; i++) {
				array[i] = sc.next();
				}
			for(int i=0 ; i<n ; i++) {
				if(array[i].length() > array[index].length()) 
				 index = i; 
			 	
			}
			T--;
		System.out.println("Word with maximum length is : " + array[index]);
		}
			
	}

}
