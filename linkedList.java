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
		Node next = new Node(value, head.getNext);
		head.setNext(next);
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
		Node now = head;
		for(int i = 1; i<=3; i++){
			if(now.getNode() != null){
				now = now.getNext();
			}else{
				push(null);
				now = now.getNext();
			}
			now.setValue(i);
			if(i == 3){
				now.setNext(null);
			}
		}
	}
	/**
	 * testMethods
	 * 		runs and ensures the value of all the methods
	 *
	 */
	public void testMethods(){
		Node now = head;
		System.out.println("Head: " + head);
		System.out.println("Initial Length: " + length);
		push(21);
		System.out.println("New Node that was just created by push: " + head.getNext());
		System.out.println("New length with one node: " + length);
		buildOneTwoThree();
		for(int i = 1; i <= 3; i++){
			now = now.getNext();
			System.out.println("Info about Node " + i + " in the linked list after running buildOneTwoThree: " + now);
		}
	}
}