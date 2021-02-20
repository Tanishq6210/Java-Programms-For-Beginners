package geeksForGeeks;
import java.util.Scanner;
public class Compete {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();		
		    int a_score = 0;
		    int b_score = 0;
		    while(t-- > 0){
		       int a_scores[] = new int[3];
		       int b_scores[] = new int[3];
	    	       for(int i = 0; i< 3 ; i++){
	    	           a_scores[i] = sc.nextInt();
	    	       }
	    	       for(int i = 0; i< 3 ; i++){
	    	           b_scores[i] = sc.nextInt();
	    	       }
		    
		       for(int i = 0 ; i< 3; i++){
		           if(a_scores[i] > b_scores[i])
		                a_score++;
		           else
		                b_score++;
		       }
		    
		        System.out.println(a_score + " " + b_score);
		        a_score = 0;
		        b_score = 0;
		    }

	}

}
