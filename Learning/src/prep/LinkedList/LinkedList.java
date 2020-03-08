package prep.LinkedList;

import prep.LinkedList.LinkedList.Node;

public class LinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printlist(LinkedList ll) {
		Node n = ll.head;
		int counter = 1;
		while (n != null) {
			System.out.println(counter + " : " + n.data);
			n = n.next;
			counter++;
		}
	}

	public void insertfirst(int data) {
		Node new_node = new Node(data);

		new_node.next = head;
		head = new_node;
	}

	public void insertAt(Node prev_node, int data) {

		if (prev_node == null) {
			System.out.println("Prev_node cannot be null value");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;

	}

	public void append(int data) {
		Node new_node = new Node(data);

		if (head == null) {
			new_node = head;
			return;
		}

		new_node.next = null;

		Node n = head;
		while (n.next != null) {
			n = n.next;
		}

		n.next = new_node;
		return;
	}

	public int length() {

		if (head == null)
			return 0;

		Node n = head;
		int counter = 0;
		while (n != null) {
			counter++;
			n = n.next;

		}
		return counter;
	}
	
	public void delete(int data)
	{
		
	}
	}

