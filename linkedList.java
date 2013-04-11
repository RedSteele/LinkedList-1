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
	 * Constructor
	 * 
	 * @param  value - the value you want the head to have
	 * 
	 */
	public linkedList(int value){
		this.head = new Node(value);
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
		now = head.getNext().getNext().getNext();
		now.setNext(null);
	}

	/**
	 * print
	 * 		prints the linked list to the screen
	 */
	public static void print(){
		int length = length();
		Node now = head;
		for(int i = 0; i<=length; i++){
			System.out.print("Node " + i + ": " + now);
			now = now.getNext();
		}	
		System.out.println("The list has finished printing.");
	}

	/**
	 * count
	 * 		counts the number of times a certain number occurs in the linked list
	 *
	 * @param num - the number you want to look for in the linkedList
	 *
	 * @return int
	 * 
	 */
	public static int count(int num){
		int length = length();
		Node now = head;
		int count = 0;
		for(int i = 0; i<length; i++){
			now = now.getNext();
			if(now.getValue() == num){
				count++;
			}
		}
		return count;
	}

	/**
	 * getNth
	 * 		returns the value of the node at the nth index of the list
	 *
	 * @param n - the index that you want to find the value of
	 *
	 * @return int
	 * 
	 */
	public static int getNth(int n){
		int value;
		Node now = head.getNext();
		for(int i = 0; i<n; i++){
			now = now.getNext();
		}
		value = now.getValue();
		return value;
	}

	/**
	 * empty 
	 * 		empties the list
	 */
	public static void empty(){
		head.setNext(null);
	}

	/**
	 * pop
	 * 		removes the first element from the list and returns its value
	 *
	 * precondition - the list may not be empty
	 * 
	 * @return int;
	 */
	public static int pop(){
		Node first = head.getNext();
		Node now = first.getNext();
		head.setNext(now);
		return first.getValue();
	}

	/**
	 * linearSearch
	 * 		Given an int n, returns the index where it is found
	 *
	 * @param n - the number you want to find the index of
	 *
	 * @return int
	 */
	public static int linearSearch(int n){
		Node now = head;
		int length = length();
		int index = -1;
		for(int i = 0; i<length; i++){
			now = now.getNext();
			if(now.getValue() == n){
				index = i;
			}
		}
		return index;
	}

	/**
	 * insertNth
	 * 		insert the given value into the linked list at the given n index
	 *
	 * @param value - value that the user wants inserted into the linkedList
	 * @param  n - index that you want the value to be inserted into
	 */
	public static void insertNth(int value, int index){
		Node n = new Node(value);
		Node now = head;
		if(index == 0){
			push(value);
		}
		if(index > length()){
			return;
		}
		for(int i = 0; i<=index; i++){
			now = now.getNext();
			if(i == index-1){
				n.setNext(now.getNext());
				now.setNext(n);
			}
		}
	}

	/**
	 * sortedInsert
	 * 		creates and inserts a node into a sorted linkedList so that the list stays sorted
	 *
	 * precondition: the list must be sorted in ascending order
	 * @param  value - value of the node you want to insert
	 * 
	 */
	public static void sortedInsert(int value){
		Node now = head.getNext();
		int index = 0;
		boolean run = true;
		while(run && now.getValue()<value){
			index++;
			if(now.getNext() != null){
				now = now.getNext();
			}else{
				run = false;;
			}	
		}
		insertNth(value, index);
	}

	/**
	* insertSort
	*		rearranges nodes in list so they are sorted in ascending order
	*
	**/
	public static void insertSort(){
	
	}

	/**
	* append
	*	given another LinkedList, appends the values from that list to the end of this list
	*
	*@param list - the LinkedList you wish to append to this list
	*
	**/
	public static void append(LinkedList list){
   		Node now = head;
   		for(int i = 0; i<length(); i++){
   			now = head.getNext();
   		}
   		now.setNext(list.getHead().getNext());
	}	

	/**
	* frontBackSplit
	*		return a length 2 array of LinkedLists that contains the front and back halves of the list
	*
	*@return LinkedList[2]
	*
	**/
	public static LinkedList[] frontBackSplit(){
		int halfLength = length()/2;
		LinkedList first = new LinkedList();
		LinkedList second = new LinkedList();
		LinkedList[] halves = {first, second};
		Node now = head;
		for(int i = 0; i<halfLength; i++){
			now = now.getNext();
			first.push(now.getValue());
		}
		for(int i = halfLength; i<length(); i++){
			now = now.getNext();
			second.push(now.getValue());
		}
		return halves;
	}
	
	/**
	* removeDuplicates
	* 		deletes any duplicate nodes from the list
	*
	*precondition: the list must be sorted in increasing order
	*
	**/
	public static void removeDuplicates(){
		Node now = head.getNext();
		Node next = now.getNext();
		int posDup = now.getValue();
		for(int i = 1; i<length(); i++){
			if(next.getValue() == posDup){
				now.setNext(next.getNext());
			}
		}
	}

	/**
	* alternatingSplit
	*		returns a length 2 array of LinkedLists; the first list consists of the values of the odd nodes, and the second consists of the values of the even nodes
	*
	*@return LinkedList[2]
	*
	**/
	public static void alternatingSplit(){
		LinkedList first = new LinkedList();
		LinkedList second = new LinkedList();
		LinkedList[] halves = {first, second};
		Node now = head;
		for(int i = 0; i<length(); i++){
			now = now.getNext();
			if(i%2 == 1){
				first.push(now.getValue());
			}else{
				second.push(now.getValue());
			}	
		}
		return halves;
	}	

	/**
	* sortedMerge
	*		takes in 2 LinkedLists and returns the result of merging the 2 lists and organizing the result in ascending order
	*
	*@param a - the first list you want to merge
	*@param b - the second list you want to merge
	*
	**/
	public static void sortedMerge(LinkedList a, LinkedList b){
	
	}


	/**
	 * testMethods
	 * 		runs and prints the results of all the methods for debugging purposes
	 *
	 */
	public static void testMethods(){
		//test head
		Node now = head;
		System.out.println("Head: " + head);

		//test length
		System.out.println("Initial Length: " + length());

		//test push
		push(21);
		System.out.println("New Node that was just created by push: " + head.getNext());
		System.out.println("New length with one node: " + length());

		//test buildOneTwoThree
		buildOneTwoThree();
		for(int i = 1; i <= 3; i++){
			now = now.getNext();
			System.out.println("Info about Node " + i + " in the linked list after running buildOneTwoThree: " + now + "  ");
		}

		//test count
		System.out.println("number of ones in linkedList(count test): " + count(1));

		//test getNth
		System.out.println("value of node at index 2(getNth test): " + getNth(2));

		//test print
		print();

		//test empty
		empty();
		System.out.print("empty test: ");
		print();
		push(42);

		//test pop
		System.out.println("Head reference before pop: " + head.getNext());
		System.out.println("Value of the first element in the list(pop test): " + pop());
		System.out.println("Head reference after pop: " + head.getNext());
		push(12);
		push(123);
		push(45);
		push(67);

		//test linearSearch
		System.out.println("Index of the number 123(linearSearch test, should be 2): " + linearSearch(123));

		//test insertNth
		insertNth(4,2);
		System.out.println("value of node at index 2 after insertNth(insertNth test): " + getNth(2));
		print();

		//test sortedInsert
		System.out.println("sortedInsert test; the linkedList should go 4,9,10,12,13,13,15,21");
		empty();
		push(21);
		push(15);
		push(13);
		push(13);
		push(12);
		push(9);
		push(4);
		sortedInsert(10);
		print();
	}
}