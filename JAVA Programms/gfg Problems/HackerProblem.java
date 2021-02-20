package geeksForGeeks;

import java.util.Scanner;

public class HackerProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str = sc.next();
			int n = str.length();
			int count=0;
			boolean arr[] = new boolean[200];
			
			for(int i=0; i<n ;i++) {
				char c = str.charAt(i);
				int a= c;
				if( c != 'a' && c != 'e'&& c !='i' && c != 'o' && c != 'u' && arr[a] == false) {
					count++;
					arr[a] = true;
				}
			}
		
			if(count %2 == 0) {
				System.out.println("SHE!");
			} else {
				System.out.println("HE!");
			}
		}
	}

}
