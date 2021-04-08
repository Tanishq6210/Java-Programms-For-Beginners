package linked_list;

public class PalindromeString {

	static class node{
		String data;
		node next;
		
		node(String data){
			this.data = data;
			this.next = null;		}
	}
	
	static node head = null;
	static node temp;
	public static void main(String[] args) {

		insertFront("cc");
		System.out.println(compute());

	}
	
	static void insertFront(String data) {
		node newnode = new node(data);
		if(head == null) {
			head = newnode;
		}else {
			head.next = newnode;
		}
	}
	
	static void insertEnd(String data) {
		node newnode = new node(data);
		if(head == null) {
			head = newnode;
		}else {
			temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
		}
	}
	
	static String deleteFront() {
		if(head == null) {
			System.out.println("Linked List is Empty.");
			return "0";
		}
		else {
			temp = head;
			head = head.next;
			return temp.data;
		}
	}
	
	static String deleteEnd() {
		if(head == null) {
			System.out.println("Linked List is Empty.");
			return "0";
		}else {
			temp = head;
			node prev = null;
			while(temp.next != null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
			return temp.data;
		}
	}
	
	static void display() {
		temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
    public static boolean compute()
    {
        if(head == null) return true;
        String ans="";
        node temp = head;
        while(temp != null){
            ans = ans + temp.data;
            temp = temp.next;
        }
        String rev = "";
        for(int i=0; i<ans.length(); i++){
            rev=rev+ans.charAt(ans.length()-1-i);
        }
        System.out.println(ans + " " +rev);
        return ans.contains(rev);
    }
}
