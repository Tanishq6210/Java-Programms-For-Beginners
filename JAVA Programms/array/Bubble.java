package array;

public class Bubble {
	public static void main (String[] args) {
		
		int a[] = {4 , 8, 1, 9, 6 , 10};
		int n = a.length;
		boolean sorted = true;
			for(int i =0; i<n-1 ;i++) {
				for (int  j=0 ; j<n-1-i ; j++) {//-i kiya qki harbaar last element ko scheck krne ki zroorat nhi
					int temp;
					if(a[j] > a[j+1]) {
						 temp = a[j];
						 a[j] = a[j+1];
						 a[j+1] = temp;
				sorted = false;
					}
				if(sorted) break;//break lgaya taaki sorted hote hi aage na jae
				}
			}
				for(int item : a) 
				System.out.print("  "+item); 
			//this for loop is known as for each loop used to print array elements
			                                 //or enhanced for loop
	}


}
