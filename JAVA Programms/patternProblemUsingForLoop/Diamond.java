package patternProblemUsingForLoop;

public class Diamond {

	public static void main(String[] args) {
		
	for(int k =1;k>=1;k++) {	
		
		for(int j = 1; j<=5; j++) { 
				
					for(int i =1 ; i <=5-j ; i ++)
						{
							System.out.print(" ");
						}System.out.print("*");
				    if(j==1)System.out.println();
				
				    for(int i =1; i<=2*j-3; i++)
				    	System.out.print("*");
				    if(j>1)System.out.println("*");
			
				}
		
		for(int j=1 ; j<=4; j++) { 
			
			for(int i =1; i<=j; i++)
				System.out.print(" ");
			System.out.print("*");
			for(int i=1 ; i <= 2*(4-j)- 1 ; i++)
				System.out.print("*");
			if(j<4)System.out.println("*");
		}
				
			
	 }
		
	}

}
