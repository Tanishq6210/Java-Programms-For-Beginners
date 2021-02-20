package array;
import java.util.Scanner;
public class MultiplyElements{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		    int n = sc.nextInt();
		    int array[] = new int[n];
		    double product = 1;
		 
		    for(int i = 0 ; i<array.length ; i++){
		        array[i] = sc.nextInt();
		        product *= array[i];
		    }
		    
	        System.out.println("The product of the elements of array is" + product);	
	        }

}
