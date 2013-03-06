/**
 * linkedList
 *
 * 		creates and manages a linked list
 *
 */
public class linkedList {
	
	private Node head;
	private int length;

	/**
	 * Constructor
	 */
	public linkedList(){
		Node head = new Node();
		length = 0;
	}

	/**
	 * getter
	 */
	public Node getHead(){
		return head;
	}

	/**
	 * push
	 * 		add a new node to the linked list
	 *
	 * @param  value - the value you want the new Node to hold
	 */
	public void push(int value){
		Node next = new Node(value, head.getNode);
		head.setNode(next);
		length++;
	}

	/**
	 * length
	 * 		returns the number of nodes in the list
	 *
	 * @return - int
	 */
	public int length(){
		return length;
	}

	/**
	 * buildOneTwoThree
	 * 		set values of this list {1,2,3} and overwrite any previous values
	 * 		
	 */
	public void buildOneTwoThree(){
		
	}
}