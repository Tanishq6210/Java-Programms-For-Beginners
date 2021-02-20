package whileLoop;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int  reversed_no= 0;
		int last_didgit;
		int temp ;
		
		temp = n;
		while(n>0) {
			
			last_didgit = n%10;
			reversed_no = reversed_no * 10 + last_didgit;
			n=  n/10;
		}
			if(temp == reversed_no)
				System.out.println("Yes the no is palindrome");
			else
				System.out.println("no the no is not  a palindrome");

	}

}
