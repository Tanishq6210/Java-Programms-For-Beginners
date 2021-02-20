package conditionStatements;
import java.util.Scanner;
public class RatingAppUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rating ;
		System.out.println("Enter the rating : ");
		rating = sc.nextInt();
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Poor");
		    break;
		case 3 :
		    System.out.println("Average");
		    break;
		case 4:
		case 5:
			System.out.println("Good");
		}	   
	}

}