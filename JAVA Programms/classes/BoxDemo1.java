package classes;
class Box{
	double width;
	double height;
	double depth;
}
public class BoxDemo1 {

	public static void main(String[] args) {

		Box mybox = new Box();
		double vol;
		mybox.width = 3;
		mybox.height = 4;
		mybox.depth = 5;
		vol = mybox.width * mybox.height * mybox.depth;
		System.out.println(vol);
	}

}
