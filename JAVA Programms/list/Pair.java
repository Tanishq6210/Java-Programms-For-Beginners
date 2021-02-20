package list;

public class Pair< X, Y> {

    X x;
	Y y;
	
	Pair (X x ,Y y ){
		this.x = x;
		this.y = y;
	}
	
	void getDescription() {
		System.out.println(x +" " + y);
	}

}
