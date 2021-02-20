package array;

import java.util.Scanner;

public class Eg_Of_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of students");
		int n = sc.nextInt();
		float average = 0f;
		int marks[] = new int [n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the marks of "+ i +"student");
			marks[i]=sc.nextInt();
			average += marks[i];
		}
		average /= n;
		System.out.println("The average of marks is "+ average);
		

	}

}
