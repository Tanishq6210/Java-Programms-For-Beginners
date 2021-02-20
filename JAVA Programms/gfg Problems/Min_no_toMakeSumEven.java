package geeksForGeeks;

import java.util.Arrays;

public class Min_no_toMakeSumEven {

	public static void main(String[] args) {
		
		long a[] = new long[100];
		
		for(int i=0; i<100; i++) {
			a[i]=100-i;
		}
		
		for(long i: a) {
			System.out.print(i+ " ");
		}
		System.out.println();

		Arrays.sort(a);
		for(long i: a) {
			System.out.print(i+ " ");
		}
		
	}

}
