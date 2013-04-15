public class linkedListTest{

	public static void main(String[] args){
		testMethods();
	}

	/**
	 * testMethods
	 * 		runs and prints the results of all the methods for debugging purposes
	 *
	 */
	public static void testMethods(){
		LinkedList list = new LinkedList();
		LinkedList two = new LinkedList();
		//test head
		Node now = list.getHead();
		System.out.println("Head: " + list.getHead());

		//test length
		System.out.println("Initial Length: " + list.length());

		//test push
		list.push(21);
		System.out.println("New Node that was just created by push: " + list.getHead().getNext());
		System.out.println("New length with one node: " + list.length());

		//test buildOneTwoThree
		list.buildOneTwoThree();
		for(int i = 1; i <= 3; i++){
			now = now.getNext();
			System.out.println("Info about Node " + i + " in the linked list after running buildOneTwoThree: " + now + "  ");
		}

		//test count
		System.out.println("number of ones in linkedList(count test): " + list.count(1));

		//test getNth
		System.out.println("value of node at index 2(getNth test): " + list.getNth(2));

		//test print
		list.print();

		//test empty
		list.empty();
		System.out.print("empty test: ");
		list.print();
		list.push(42);

		//test pop
		System.out.println("Head reference before pop: " + list.getHead().getNext());
		System.out.println("Value of the first element in the list(pop test): " + list.pop());
		System.out.println("Head reference after pop: " + list.getHead().getNext());
		list.push(12);
		list.push(123);
		list.push(45);
		list.push(67);

		//test linearSearch
		System.out.println("Index of the number 123(linearSearch test, should be 2): " + list.linearSearch(123));

		//test insertNth
		list.insertNth(4,2);
		System.out.println("value of node at index 2 after insertNth(insertNth test): " + list.getNth(2));
		list.print();

		//test sortedInsert
		System.out.println("sortedInsert test; the linkedList should go 4,9,10,12,13,13,15,21");
		list.empty();
		list.push(21);
		list.push(15);
		list.push(13);
		list.push(13);
		list.push(12);
		list.push(9);
		list.push(4);
		list.sortedInsert(10);
		list.print();

		//test append
		System.out.println("Append Test");
		two.push(1545);
		two.push(1545);
		two.push(1545);
		two.push(1545);
		two.push(1545);
		two.push(1545);
		two.print();
		list.print();
		list.append(two);
		list.print();

		//test frontBackSplit
		System.out.println("frontBackSplit test");
		System.out.println("Entire list");
		list.print();
		LinkedList[] splits = list.frontBackSplit();
		System.out.println("First half");
		splits[0].print();
		System.out.println("Second half");
		splits[1].print();

		//test removeDuplicates
		System.out.println("removeDuplicates test");
		System.out.println("Before removing duplicates");
		list.print();
		list.removeDuplicates();
		System.out.println("After removing duplicates");
		list.print();		
	}
}