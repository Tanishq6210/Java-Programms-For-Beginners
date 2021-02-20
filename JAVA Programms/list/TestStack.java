package list;

public class TestStack {

	public static void main(String[] args) {
		
		Stack stck1 = new Stack();
		Stack stck2 = new Stack();
		
		for(int i= 0; i<10; i++) stck1.push(i); 
		for(int i=10; i<20; i++) stck2.push(i);
		
		System.out.println("Stack in mystack 1");
		for(int i=0; i<10 ; i++) {
			System.out.println(stck1.pop());
		}
	
		System.out.println("Stack in mystack 2");
		for(int i=0; i<10 ; i++) {
			System.out.println(stck2.pop());
		}
	
	
	}

}
