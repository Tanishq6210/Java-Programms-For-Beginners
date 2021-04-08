package linked_list;

public class PolynomialRepresent {
	
	static class node {
		int coeff;
		int pow;
		node next;
		
		node(int x, int y){
			this.coeff = x;
			this.pow = y;
			this.next = null;
		}	
	}
	
	static node head1, head2; 
	public static void main(String[] args) {
		insertPoly1(2, 2);
		insertPoly1(3, 1);
		insertPoly1(4, 0);
		polyOneDisplay();
		insertPoly2(2, 2);
		insertPoly2(3, 1);
		insertPoly2(4, 0);
		polyTwoDisplay();

	}
	
	static void insertPoly1(int co, int po) {
		node newnode = new node(co,po);
		if(head1 == null)
			head1 = newnode;
		else {
			node temp = head1;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	static void insertPoly2(int x, int y) {
		node newnode = new node(x,y);
		if(head2 == null)
			head2 = newnode;
		else {
			node temp = head2;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	static void polyOneDisplay() {
		node temp = head1;
		while(temp.next != null) {
			
			System.out.print(temp.coeff + "x^" + temp.pow + " + ");
			temp = temp.next;
		}
		System.out.println(temp.coeff + "x^" + temp.pow);
		
	}
	
	static void polyTwoDisplay() {
		node temp = head2;
		while(temp.next != null) {
			System.out.print(temp.coeff + "x^" + temp.pow + " + ");
			temp = temp.next;
		}
		System.out.println(temp.coeff + "x^" + temp.pow);
	}

	static void polyAdd() {
		node temp = head1;
		int count1 = 0;
		int count2 = 0;
		while(temp != null) {
			count1++;
			temp = temp.next;
		}
		temp = head2;
		while(temp != null) {
			count2++;
			temp = temp.next;
		}
	}
}
