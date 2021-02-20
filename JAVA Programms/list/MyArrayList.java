package list;
import java.util.ArrayList;
import java.util.List;
public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		List<String> vegetables = new ArrayList<String>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
		vegetables.add("Potato");
		vegetables.add("Onion");
		
		fruits.addAll(vegetables);
		
		System.out.println(fruits);
		System.out.println(fruits.size());
	
//		Pair <String, Integer> p1 = new Pair("Tanishq", 409);
//		Pair<Boolean, String> p2 = new Pair(true, "Tyagi");
//	
//		p1.getDescription();
//		p2.getDescription();
	
	}

}
