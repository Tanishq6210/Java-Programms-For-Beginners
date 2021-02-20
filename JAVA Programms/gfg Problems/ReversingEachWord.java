package geeksForGeeks;

import java.util.Scanner;

public class ReversingEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			int n = str.length();
			String ans = "";
			
			for(int i=0; i<n; i++) {
				int j=i;
				while(str.charAt(i) == '.') i++;
					ans = ans.concat(str.substring(i,j+1) );
			}
			System.out.println(ans);
		}
	}

}
