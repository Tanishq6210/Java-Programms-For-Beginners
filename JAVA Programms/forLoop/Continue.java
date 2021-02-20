package forLoop;

public class Continue {

	public static void main(String[] args) {
		/* Basically CONTINUE keyword is use to skip the current executing loop and moves to the next
		loop*/
		
		for (int i = 1 ; i<=100 ; i++) {
			if (i>40  && i<50)
				continue;
			System.out.println(i);
		}
	}

}
