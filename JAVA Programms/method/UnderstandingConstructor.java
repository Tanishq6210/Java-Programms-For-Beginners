package method;

class Vehicle {
	int wheels ;
	int headlights;
	String colour;
	
	Vehicle(int wheels){
		this.wheels = wheels;
		headlights = 2;
		colour = "White";
		
	}

	Vehicle(int wheels , int headlights){
		this.wheels = wheels;
		this.headlights = headlights ;
		colour = "Red";
	}
	
	Vehicle(int a , int b , String colour){
		wheels = a;
		headlights = b;
		this.colour = colour;
	}
	
	Vehicle(){
		System.out.println("No data is given");
		
	}
	public static void main(String args[]) {

	Vehicle car = new Vehicle(4);
	Vehicle jupiter = new Vehicle();
	Vehicle truck = new Vehicle(4,2);
	Vehicle car1 = new Vehicle(3,2,"White");
	
	//Its the examples of constructor overloading
	
	
	
	
	
	}
}