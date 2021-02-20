package patternProblemUsingForLoop;
import java.util.Scanner;
public class HwQues6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
//		for(int i =1; i <=n ; i++)
//		      System.out.print("  ");
//		      System.out.println("1");
//		
//		for (int j=2 ; j<=n; j= j +2) {
//				for(int i =1 ; i<=n-j; i++)
//					System.out.print("  ");
//				int number =1; 
//				for (int i = 1; i<= j+1 ; i++)
//					System.out.print( number++ +"   ");
//			System.out.println();
//		
//		} 
	    for(int j =1; j<=n ; j++)
	    {
	    		for(int i =1 ; i<=n-j ; i++)
	    			System.out.print("   ");
	    		int number =1;
	    		
	    		for(int i=1; i<=j*2-1; i++)
	    			System.out.print(number++ +"  ");
	        System.out.println();
	    }
	
	}

}
