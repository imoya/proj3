

public class Stack {
	
	public Node head; // assume Node has fields value (entry) and next
	public int size;

	public Stack(Node n) {
		
		head = n;
		size = 0;
	
	}
	
	public void push(char entry ) {
	
		// create a node with character
		
		Node v = new Node(entry, nul);
		v.next = head;
		head = v;
		size++
	
	}
	
	public char pop(){
		

		head = head.next;
		char val = head.entry;
		size--;
		return val;
		
	}
	
	public char peek() {
	
		//return the data element only; remove node component
		if (head != null) {
			char val = head.entry;
			return val;
		}
		else {
			return null;
		}
	}
	
	public boolean isEmpty(){
		
		if ( head == null) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public int size(){
		return size;
	}


}