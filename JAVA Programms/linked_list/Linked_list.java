package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_list {

	static class node{
		int data;
		node next;
		
		node(int data){
			this.data = data;
			this.next = null;		}
	}
	
	static node head = null;
	static node temp;
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		
//		insertFront(19);
//		insertFront(28);
//		insertEnd(37);
//		insertEnd(46);
//		insertEnd(55);
//		System.out.println(moduarNode(2));
		for(int i=0; i<1000; i++) {
			System.out.println("ONCE");
		}
		
	}
	
	static void insertFront(int data) {
		node newnode = new node(data);
		if(head == null) {
			head = newnode;
		}else {
			head.next = newnode;
		}
	}
	
	static void insertEnd(int data) {
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
	
	static int deleteFront() {
		if(head == null) {
			System.out.println("Linked List is Empty.");
			return 0;
		}
		else {
			temp = head;
			head = head.next;
			return temp.data;
		}
	}
	
	static int deleteEnd() {
		if(head == null) {
			System.out.println("Linked List is Empty.");
			return 0;
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
	
    public static int moduarNode(int k)
    {
        ArrayList<Integer> ar = new ArrayList<>();
        node temp = head;
        while(temp != null){
            ar.add(temp.data);
            temp = temp.next;
        }
        for(int i=ar.size()-1; i>=0; i--) {
        	if(ar.get(i)%k==0) {
        		return ar.get(i);
        	}
        }
        return -1;
    }
}
