package linked_list;

public class DoublyLinkedList {

	class Node{
		Node prev;
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	Node head = null;
	
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFront(5);
		list.insertFront(4);
		//list.insertFront(3);
		list.insertFront(2);
		list.insertFront(1);
		list.insertEnd(6);
		list.insertEnd(7);
		list.display();
		list.insertMiddle(3, 3);
		list.display();
		list.deleteMiddle(3);
		list.display();
		list.displayReverse();
		list.rotateP(1);
		list.display();
		
	}

	void insertFront(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}else {
			head.prev = newnode;
			newnode.next = head;
			head = newnode;
		}
	}
	
	void insertEnd(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
		}
	}
	
	void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	void displayReverse() {
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

	int deleteFront() {
		if(head == null) {
			System.out.println("List is Empty, Try inserting some value ");
			return 0;
		}else {
			Node temp = head;
			head = head.next;
			head.prev = null;
			return temp.data;
		}
	}

	int deleteEnd() {
		if(head == null) {
			System.out.println("List is Empty, Try inserting some elements.");
			return 0;
		}else {
			Node temp = head;
			Node prev = null;
			while(temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			temp.prev = null;
			temp.next = null;
			return temp.data;
		}
	}

	void insertMiddle(int data, int position) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}else {
			Node temp = head;
			Node prev = null;
			int i = 0;
			while(i<position-1) {
				prev = temp;
				temp = temp.next;
				i++;
			}
			prev.next = newnode;
			temp.prev = newnode;
			newnode.prev = prev;
			newnode.next = temp;
		}
	}

	int deleteMiddle(int position) {
		if(head == null) {
			System.out.println("List is empty, try inserting some elements.");
			return 0;
		}else {
			Node temp = head;
			Node prev = null;
			int i = 0;
			while(i<position-1) {
				prev = temp;
				temp = temp.next;
				i++;
			}
			prev.next = temp.next;
			temp.next.prev = prev;
			return temp.data;
		}
	}


}
