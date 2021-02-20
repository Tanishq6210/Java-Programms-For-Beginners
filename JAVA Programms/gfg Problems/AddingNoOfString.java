package geeksForGeeks;

import java.util.Scanner;

public class AddingNoOfString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		boolean check= false;
		int temp=0;
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			String ans="";
			if(check=Character.isDigit(str.charAt(i))) {
				for(int j=i; j<str.length(); j++) {
					if(check=Character.isDigit(str.charAt(j))) {
						ans = ans +""+str.charAt(j);
						temp=j;
					}else break;
				}
				i=temp;
				sum = sum+ Integer.parseInt(ans);
			}
		}
		System.out.println(sum);
			}

}
