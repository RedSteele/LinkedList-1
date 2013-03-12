/**
 * Node
 *
 * 		A member of a linked list that holds an integer value and a link to another node
 *
 * 
 */

public class Node {
	
	private int value;
	private Node next;

	/**
	 * Constructors
	 */
	public Node(){
		this(0, null);
	}

	public Node(int value){
		this(value, null);
	}

	public Node(int value, Node next){
		this.value = value;
		this.next = next;
	}

	/**
	 * getters and setter
	 */
	public void setValue(int value){
		this.value = value;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public int getValue(){
		return value; 
	}

	public Node getNext(){
		return next;
	}

	/**
	 * toString
	 * 		returns the value and node reference of this node in string format
	 */
	public String toString(){
		return "value: " + value + "\tnext Node reference: " + next; 
	}
}