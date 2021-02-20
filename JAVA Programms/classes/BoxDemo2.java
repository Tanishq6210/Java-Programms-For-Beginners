package classes;

public class BoxDemo2 {

	public static void main(String[] args) {
		
		Box b1;
		b1 = new Box();
		Box b2 = b1;
		b1.width = 1;
		b1.height = 2;
		b1.depth = 3;
		System.out.println(b2.width + " " + b2.height + " " + b2.depth);		
		b1 = null;
//		System.out.println(b1.width + " " + b1.height + " " + b1.depth);
		System.out.println(b2.width + " " + b2.height + " " + b2.depth);
	}

}
