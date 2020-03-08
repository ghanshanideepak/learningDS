package prep.LinkedList;

import prep.LinkedList.LinkedList.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedlist1 = new LinkedList();
		
		
		linkedlist1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		//Node new_first = new Node(3);
		LinkedList ll2 = new LinkedList();
		
		linkedlist1.head.next = second;
		second.next = third;
		linkedlist1.insertfirst(0);
		linkedlist1.append(5);
		linkedlist1.insertAt(third, 3);
		linkedlist1.printlist(linkedlist1);
		System.out.println("Size of List      " + linkedlist1.length() );
		System.out.println("Size of ll2       "+ ll2.length());
		

	}
	
	

}
