package linked_list;

public class LinkedListMatrix {
	static class Node
	{
	    int data;
	    Node right,down;
	    
	    Node(int data){
	        this.data = data;
	        right = null;
	        down = null;
	    }
	}
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int value = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=value;
				value++;
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j] + " ");;
			}
			System.out.println();
		}
	}

    static Node construct(int arr[][],int n)
    {
        Node head=null;
        int value=1;
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		Node newnode = new Node(value);
        		if(head==null) {
        			head = newnode;
        		}else {
        			Node temp = head;
        			while(temp .right != null) {
        				temp = temp.right;
        			}temp.right=newnode;
        		}
        	}
        }
        return head;
    }
}
