package geeksForGeeks;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Palindrome_ChckerInLinkedList {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); LinkedList<Integer> list = new
				LinkedList<>();

		int n= sc.nextInt(); while(n-- > 0) { list.push(sc.nextInt()); }

		if(palindrome(list)) System.out.println("Yes linked list is a palindrome");
		else  System.out.println("No the linked list is not a palindrome");
		 
	}
	
	public static boolean palindrome(LinkedList<Integer> ll) {
		 Stack<Integer> stack = new Stack<>();
		 boolean check = true;
		 for(int i=0; i<ll.size(); i++) {
			 stack.push(ll.get(i));
		 }
		 
		 for(int i=0; i<ll.size(); i++) {
			 if(ll.get(i) != stack.pop()) {
				 check = false;
				 break;
			 }
		 }
		return check;
	}

}
