package geeksForGeeks;

import java.util.Stack;

public class ParanthesisCheckerUsingStack {

	public static void main(String[] args) {
		String str = "{{{([])}}}])";
		boolean isbalanced = true;
		Stack<Character> stack = new Stack<>();
		long start2 = System.currentTimeMillis();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				stack.push(ch);
				continue;
			}
			if(ch == ')'){
				if(stack.peek() == ')') {
					stack.pop();
					isbalanced = false;
				}
			}else if(ch == '}'){
				if(stack.peek() == '}') {
					stack.pop();
					isbalanced = false;
				}
			}else if(ch == ']'){
				if(stack.peek() == ']') {
					stack.pop();
					isbalanced = false;
				}
			}
		}
		if(stack.isEmpty()) {
			isbalanced = false;
		}
		if(isbalanced) System.out.println("Balanced");
		else System.out.println("Not balanced");
		long end2 = System.currentTimeMillis();
		System.out.println("TIme taken bly stack method --->" + (end2-start2));
		
		
//		Stack<Character> stack = new Stack<Character>();
//		long start = System.currentTimeMillis();
//		String x = "{{{([])}}}])";
//		boolean check = true;
//        int top = 0;
//        for(int i=0; i<x.length(); i++){
//            if(x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '['){
//                stack.push(x.charAt(i));
//                top++;
//            } else if(x.charAt(i) == ')' || x.charAt(i) == '}' || x.charAt(i) == ']'){
//            	if(stack.empty()) {
//            		check = false;
//            		break;
//            	}
//            	else{stack.pop();
//                top--;
//            	}
//            }
//        }
//        if(top == 0 && check == true) {
//        	System.out.println("True");
//        } else {
//        	System.out.println("False");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Time consumed by stack method ---->" + (end-start));
        long start1 = System.currentTimeMillis();
        int check1=0,check2=0,check3=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '[') check1++;
            else if(str.charAt(i) == '{') check2++;
            else if(str.charAt(i) == '(') check3++;
            else if(str.charAt(i) == ']') check1--;
            else if(str.charAt(i) == '}') check2--;
            else if(str.charAt(i) == ')') check3--;
        }
        if(check1==0 && check2==0 && check3==0) System.out.println("True");
        else System.out.println("False");
        long end1 = System.currentTimeMillis();
        System.out.println("Time consumed by string method ---->" + (start1 - end1));

	}

}
