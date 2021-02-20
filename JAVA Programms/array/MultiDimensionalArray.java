package array;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the noumber of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns ");
		int col = sc.nextInt();
		
		int a[][] = new int [rows][col];
		int b[][] = new int [rows][col];
		int c[][] = new int [rows][col];
		
		System.out.println("Enter the elements of array a");
			for(int i =0; i<rows ; i++) {
				for(int j = 0; j<col ; j++)
					{a[i][j] = sc.nextInt();
		
					}System.out.println();
				}
		
			System.out.println("Enter the elements of array b");
			for(int i = 0; i<rows ; i++) {
				for(int j =0 ; j<col ; j++)
					{b[i][j]= sc.nextInt();
					}System.out.println();
					
				}
	
			System.out.println("The elements of the matrix c is");
			for(int i =0 ; i<rows; i++) {
				for(int j =0 ; j<col ; j++) {
					c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+"  ");
				}System.out.println();
			}
			
			
	
	
	}

}
