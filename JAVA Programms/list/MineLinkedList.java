package list;
import java.util.ArrayList;
public class MineLinkedList{
	Node head;
	
	public void add(int data) {
		Node toadd = new Node(data);
		if(head == null) {
			head = toadd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp= temp.next;
		}
		temp.next=toadd;
	}
	
	public int size(){
			int count=0;
			Node temp = head;
			while(temp != null) {
				temp=temp.next;
				count++;
			}
			return count;
		}
	
	public void print() {
			Node temp= head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			if(temp == null) {
				System.out.println();
			}
		}
	
	void clear() {
			head = null;
		}
	
	public void addFirst(int data) {
			Node toadd = new Node(data);
			toadd.next= head;
			head= toadd;
		}
	
	public void addLast(int data) {
			Node toadd = new Node(data);
			Node temp = head;
			while(temp.next!=null) {
				temp= temp.next;
			}
			temp.next = toadd;
		}
	
	ArrayList<Integer> doclone() {
				ArrayList<Integer> list = new ArrayList<>();
				Node temp = head;
				while(temp != null) {
					list.add(temp.data);
					temp = temp.next;
				}
				return list;
			}

	boolean contains(int data) {
		Node temp = head;
		boolean check=false;
		while(temp!=null) {
			if(temp.data == data) {
				check = true;
			}
			temp= temp.next;
		}
		return check;
	}

	int firstElement() {
		return head.data;
	}

	int getIndex(int index) {
		Node temp = head;
		int check=0;
		while(check <= index) {
			if(check== index) {
				return temp.data;
			}
			temp= temp.next;
		}
		return 1;
	}
	
	public int getLast() throws Exception{

		Node temp = head;
		if(temp == null) throw new Exception("Cannot peek element if the stack is empty");
		
		while(temp.next != null) {
			temp = temp.next;
			
		}
		return temp.data;
	}
	
	public int toRemove() throws Exception{

		Node temp = head;
		if(temp == null) {
			throw new Exception("Cannot pop element if the stack is empty");
		}
		else if(temp.next == null) {
			Node toremove = temp;
			head = null;
			return toremove.data;
		}else {
			while(temp.next.next != null) {
				temp = temp.next;
			}Node toremove = temp.next;
			temp.next = null;
			return toremove.data;
		}
	}
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
	
	public Node toremove() {
		Node temp = head;
		int tocheck = 0;
		while(temp.next != null) {
			if(temp.next.data == tocheck) {
				Node toPass = temp.next;
				while(toPass.data == tocheck) {
					toPass = toPass.next;
				}
				temp.next = toPass;
			}
			else {
				tocheck = temp.data;
				continue;	
			}
			temp = temp.next;
		}
		return head;
	}
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
}
	

