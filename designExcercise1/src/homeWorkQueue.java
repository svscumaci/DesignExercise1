//import java.util.Collection;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Queue;

public class homeWorkQueue<T> {
	
	//Queue<T>  homeWorkList = new LinkedList<T>();

	private Node head;
	
	public class Node {
		public T value;
		public Node next;

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public void addFront(T newHomeWork) {
		Node newNode = new Node(newHomeWork, head);
		head = newNode;
	}
	
	public void add(T toAdd) {
		Node curr = head;
		if(curr == null) {	//special case: adding to empty list
			addFront(toAdd);
			return;
		}
			
		while(curr.next != null) {  //advance curr so it points at the last node
	        curr = curr.next;
		}
		Node newNode = new Node(toAdd, null);
		curr.next= newNode;
	}
	
	public String toString() {
		String empty = "";
		
		Node curr = head;
		while(curr != null) {
			empty += " " + curr.value;
			curr = curr.next;
		}
		return empty; 
	}
	
	public void removeFront() { //removes finished homework assignment
		Node curr = head;
		curr = curr.next;
		head = curr; 
	}

}

