package geeksForGeeks;

import java.util.Scanner;

public class Longest1count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans =0;
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			String arr[] = str.split("0");
			for(String s : arr) {
				ans = Math.max(ans, s.length());
			}
			System.out.println(ans);
		}
	}

}
