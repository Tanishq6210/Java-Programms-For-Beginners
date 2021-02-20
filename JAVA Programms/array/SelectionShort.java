package array;

public class SelectionShort {

	public static void main(String[] args) {
		int a[] = {9, -1, 0 ,5 ,4 , 8};
		int n= a.length;
		
			for(int i= 0 ; i<n-1;i++) {
				int smallindex = i;
				for(int j =i ; j <=n-1 ; j++) {
					
					if(a[j] < a[smallindex])
						smallindex = j;
				      }
					int temp;
					temp = a[i];
					a[i] = a[smallindex];
					a[smallindex] = temp;
				}
			for(int e : a)
				System.out.print(e + "  ");
	}

}
