package conditionStatements;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans;
		if(a>b)
		{
              if(a>c) 
                 { 
            	  ans = a;
            	 }	
             else {
                  ans = c;
                   }
		}     
        else {
        	if (b>c) {
              ans = b;        
        	          }
        	else {  
        		ans = c;
        		};       	
        
        	}
  
  System.out.println("Is the greatest no" + ans);
        
           int result = a>b ? a>c? a: c: b>c? b : c;
           System.out.println("The greatest no is" + result);
	}	
}


	
