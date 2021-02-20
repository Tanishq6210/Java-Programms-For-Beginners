package geeksForGeeks;

import java.util.Scanner;

public class Largest_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int index=0;
		
		int T = sc.nextInt();
		while(T>0)
		{
			 
			System.out.println("Enter the number of elemnets you want int the  array");
			int n = sc.nextInt();
			double array[] = new double [n];
			for(int i = 0; i<n ; i++) {
					
				    array[i] = sc.nextInt();
				}
				
				for(int i = 0 ; i<n; i++) {
					if( array[i] > array[index])
						index = i; 
				}	
			T--;
			System.out.println("Largest element is " + array[index]);
		}

	}

}
