package conditionStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		
		System.out.println("Enter the first no.");
		float a = sc.nextFloat();
		
		System.out.println("Enter the Second no.");
		float b = sc.nextFloat();
		
		System.out.println("Enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		float result = 0;
		
	    switch (operation) {
		
	    case '+':
	    	result = (int)(a+b);
	    	break;
	    	
	    case '-':
	    	result = a-b;
	    	break;
	    
	    case '*':
	    	result = a*b;
	    	break;
	    
	    case '/':
	    	result = a/b;
	    	break;
	    }
	    System.out.println("The result is " + result);

	}

}
