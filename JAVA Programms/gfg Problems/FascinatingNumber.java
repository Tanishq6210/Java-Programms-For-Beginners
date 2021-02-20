package geeksForGeeks;

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n1,n2;
		int fascinating = 1;
		while(t-->0) {
			int n = sc.nextInt();
			
			n1= n*2;
			n2= n*3;
			String a= n+""+n1+""+ n2;
			
			System.out.println(a);
			int arr[] = new int[100];
			for(char c : a.toCharArray()) {
				int index = (int)c;
				arr[index]++;
				
			}
			for(int i = 0; i<9 ; i++) {
				arr[i]--;
			}
			
			for(int i = 0; i<9 ; i++) {
				if(arr[i] != 0)
					fascinating =0;
			}
		System.out.println(fascinating);
		}
	}
}
