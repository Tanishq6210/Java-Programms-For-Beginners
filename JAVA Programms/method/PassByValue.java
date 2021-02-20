package method;

class Dog{
	int legs;
}
public class PassByValue {

	public static void main(String[] args) {
		
		int a,b;
		a=10;
		b=20;
		swap(a,b);
		System.out.println(a + " " + b);
	
		Dog q = new Dog();
		Dog w = new Dog();
		q.legs = 4;
		w.legs = 3;
		
		swap(q, w);
		System.out.println(q.legs + " " + w.legs);
	}
	
	static void swap(int c, int d) {
		int temp = c;
		c = d;
		d = temp;
	}//Here we can see the values are not swapped 
	//we can say java is pass by value
	
	static void swap(Dog a , Dog b) {
		Dog temp = a;
		b=a;
		a= temp;
	}
}
