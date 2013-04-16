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
		/**
		* IF A METHOD TEST IS COMMENTED, IT MEANS THAT METHOD WORKS
		*
		**/
		LinkedList list = new LinkedList();
		LinkedList two = new LinkedList();
		// //test head
		// Node now = list.getHead();
		// System.out.println("Head: " + list.getHead());

		// //test length
		// System.out.println("Initial Length: " + list.length());
		// list.push(0);
		// System.out.println("Length after adding one: " + list.length());

		// //test push
		// list.push(21);
		// System.out.println("New Node that was just created by push: " + list.getHead().getNext());
		// System.out.println("New length with one node: " + list.length());

		// //test buildOneTwoThree
		// list.buildOneTwoThree();
		// for(int i = 1; i <= 3; i++){
		// 	now = now.getNext();
		// 	System.out.println("Info about Node " + i + " in the linked list after running buildOneTwoThree: " + now + "  ");
		// }

		// //test count
		// System.out.println("number of ones in linkedList(count test): " + list.count(1));

		// //test getNth
		// System.out.println("value of node at index 2(getNth test): " + list.getNth(2));

		// //test print
		// list.print();

		// //test empty
		// list.empty();
		// System.out.print("empty test: ");
		// list.print();
		// list.push(42);

		// //test pop
		// System.out.println("Head reference before pop: " + list.getHead().getNext());
		// System.out.println("Value of the first element in the list(pop test): " + list.pop());
		// System.out.println("Head reference after pop: " + list.getHead().getNext());
		// list.push(12);
		// list.push(123);
		// list.push(45);
		// list.push(67);

		// //test linearSearch
		// System.out.println("Index of the number 123(linearSearch test, should be 2): " + list.linearSearch(123));

		// //test insertNth
		// list.insertNth(4,2);
		// System.out.println("value of node at index 2 after insertNth(insertNth test): " + list.getNth(2));
		// list.print();

		// //test sortedInsert
		// System.out.println("sortedInsert test; the linkedList should go 4,9,10,12,13,13,15,21");
		// list.empty();
		// list.push(21);
		// list.push(15);
		// list.push(13);
		// list.push(13);
		// list.push(12);
		// list.push(9);
		// list.push(4);
		// list.sortedInsert(10);
		// list.print();

		// //test append
		// System.out.println("Append Test");
		// two.push(1545);
		// two.push(1545);
		// two.push(1545);
		// two.push(1545);
		// two.push(1545);
		// two.push(1545);
		// System.out.println("LIST TWO");
		// System.out.println("----------------------------");
		// two.print();
		// System.out.println("LIST ONE");
		// System.out.println("---------------------------");
		// list.print();
		// list.append(two);
		// System.out.println("TOTAL LIST");
		// System.out.println("----------------------------");
		// list.print();

		// //test frontBackSplit
		// System.out.println("frontBackSplit test");
		// System.out.println("Entire list");
		// list.print();
		// LinkedList[] splits = list.frontBackSplit();
		// System.out.println("FIRST HALF");
		// System.out.println("----------------------");
		// splits[0].print();
		// System.out.println("SECOND HALF");
		// System.out.println("----------------------");
		// splits[1].print();

		list.push(2);
		list.push(21);
		list.push(21);
		list.push(150);
		list.push(11);
		list.push(11);
		list.push(11);
		list.push(11);
		list.push(71);
		list.push(71);
		list.push(150);
		list.push(1050);
		list.push(1050);
		list.push(1050);

		//test insertSort
		// System.out.println("INSERT SORT TEST");
		// System.out.println("UNSORTED LIST");
		// System.out.println("-------------------------");
		// list.print();
		// System.out.println("SORTED LIST");
		// System.out.println("-------------------------");
		// list.insertSort();
		// list.print();

		//test removeDuplicates
		list.insertSort();
		System.out.println("REMOVE DUPLICATES TEST");
		System.out.println("BEFORE REMOVING DUPLICATES");
		System.out.println("-------------------------------------");
		list.print();
		list.removeDuplicates();
		System.out.println("AFTER REMOVING DUPLICATES");
		System.out.println("--------------------------------------");
		list.print();		

		//alternating split test
		// System.out.println();
		// System.out.println("ALTERNATING SPLIT TEST");
		// System.out.println();
		// System.out.println("Entire list");
		// System.out.println("---------------------------");
		// list.print();
		// LinkedList[] splits = list.alternatingSplit();
		// System.out.println("odd splits");
		// System.out.println("-----------------------------");
		// splits[0].print();
		// System.out.println("even splits");
		// System.out.println("---------------------------");
		// splits[1].print();

		//sortedMerge test
		// System.out.println("SORTED MERGE TEST");
		// System.out.println("LIST ONE");
		// System.out.println("---------------------------");
		// list.print();
		// two.push(534);
		// two.push(24);
		// System.out.println("LIST TWO");
		// System.out.println("---------------------------");
		// two.print();
		// LinkedList a = LinkedList.sortedMerge(list,two);
		// System.out.println("COMBINED, SORTED LIST");
		// System.out.println("---------------------------");
		// a.print();
	}
}	