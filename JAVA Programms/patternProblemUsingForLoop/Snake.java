package patternProblemUsingForLoop;

public class Snake {

	public static void main(String[] args) {
		
		System.out.println("*");
		
	for(;;){	
		for( int j= 1; j<=9; j++) {
			
			if(j<=4) {
				for(int i = 1; i<=j;  i++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
			else {
				for (int i = 1; i <=9-j+1; i++)
				System.out.print(" ");
			
			System.out.println("*");
			}
		}
     }
	}

}
