/**
 * linkedList
 *
 * 		creates and manages a linked list
 *
 */
public class linkedList {
	
	private static Node head;

	public static void main(String[] args){
		linkedList list = new linkedList();
		testMethods();
	}

	/**
	 * Constructor
	 */
	public linkedList(){
		this.head = new Node();
	}

	/**
	 * getter
	 */
	public static Node getHead(){
		return head;
	}

	/**
	 * push
	 * 		add a new node to the linked list
	 *
	 * @param  value - the value you want the new Node to hold
	 */
	public static void push(int value){
		Node next = new Node(value, head.getNext());
		head.setNext(next);
	}

	/**
	 * length
	 * 		returns the number of nodes in the list
	 *
	 * @return - int
	 */
	public static int length(){
		Node now = head;
		int length = 0;
		while(now.getNext() != null){
			now = now.getNext();
			length++;
		}
		return length;
	}

	/**
	 * buildOneTwoThree
	 * 		set values of this list {1,2,3} and overwrite any previous values
	 * 		
	 */
	public static void buildOneTwoThree(){
		Node now = head;
		for(int i = 3; i >= 1; i--){
			push(i);
			now = now.getNext();
		}
		//now.setNext(null);
	}

	/**
	 * print
	 * 		prints the linked list to the screen
	 */
	public static void print(){
		int length = length();
		Node now = head.getNext();
		for(int i = 1; i<=length; i++){
			System.out.print("Node " + i + ": " + now);
		}	
		System.out.println("The list has finished printing.");
	}

	/**
	 * testMethods
	 * 		runs and ensures the value of all the methods
	 *
	 */
	public static void testMethods(){
		Node now = head;
		System.out.println("Head: " + head);
		System.out.println("Initial Length: " + length());
		push(21);
		System.out.println("New Node that was just created by push: " + head.getNext());
		System.out.println("New length with one node: " + length());
		buildOneTwoThree();
		for(int i = 1; i <= 3; i++){
			now = now.getNext();
			System.out.println("Info about Node " + i + " in the linked list after running buildOneTwoThree: " + now + "  ");
		}
		print();
	}
}