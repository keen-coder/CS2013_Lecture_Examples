package section01_02.tester;

import section01_02.linked_list.LinkedList;
import section01_02.linked_list.Node;

public class LinkedListTester {

	public static void main(String[] args) {
//		Node<Integer> n1 = new Node<>(10);
//		Node<Integer> n2 = new Node<>(20);
//		Node<Integer> n3 = new Node<>(30);
//		Node<Integer> n4 = new Node<>(40);
//		Node<Integer> n5 = new Node<>(50);
//		Node<Integer> n6 = new Node<>(60);
//		Node<Integer> n7 = new Node<>(70);
//		Node<Integer> n8 = new Node<>(80);
//		
//		Node<Integer> head = n1;
//		
//		n1.next = n2;
//		n2.next = n3;
//		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;
//		n6.next = n7;
//		n7.next = n8;
//
//		LinkedList test = new LinkedList(head);
//		
//		System.out.println(test);
//		testAddFirst();
//		testGet();
//		testAddLast();
		
//		LinkedList<Integer> test = new LinkedList<>(10, 20, 30, 40, 50);
//		
//		System.out.println(test);
//		System.out.println(test.get(0));
//		System.out.println(test.get(1));
		
		LinkedList<Integer> test = new LinkedList<>(10, 20, 30, 40, 50);
		
		test.insert(1, 15);
		test.insert(5, 45);
		
		System.out.println(test);
		
		

	}
	
	public static void testAddFirst() {
		System.out.println("Running Test addFirst():------------------------\n");
		
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		
		String expected = "50, 40, 30, 20, 10";
		String actual = list.toString().trim();
		boolean isCorrect = expected.equals(actual);
		
		System.out.println("Expected:\t" + expected);
		System.out.println("Actual:\t\t" + actual);
		System.out.println("Correct?:\t" + isCorrect);
		
		System.out.println("End Test addFirst()-------------------\n");
	}
	
	public static void testGet() {
		System.out.println("Running Test get():------------------------\n");
		
		LinkedList<Integer> list = new LinkedList<>(10, 20, 30, 40, 50);
		
		int[] testValues = {50, 40, 30, 20, 10};
	
		for (int i = 0 ; i < testValues.length ; i++) {
			int expected = testValues[i];
			int actual = list.get(i);
			boolean isCorrect = (expected == actual);
			
			System.out.printf("%-15s %d\n", "Expected:", expected);
			System.out.printf("%-15s %d\n", "Actual:", actual);
			System.out.printf("%-15s %b\n", "Is Correct?:", isCorrect);
			System.out.println();
		}
		
		System.out.println("End Test get()-------------------\n");
	}

	public static void testAddLast() {
		System.out.println("Running Test addLast():------------------------\n");
		
		LinkedList<Integer> list = new LinkedList<>();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		String expected = "10, 20, 30, 40, 50";
		String actual = list.toString();
		boolean isCorrect = expected.equals(actual);
		
		System.out.println("Expected:\t" + expected);
		System.out.println("Actual:\t\t" + actual);
		System.out.println("Correct?:\t" + isCorrect);
		
		System.out.println("End Test addLast()-------------------\n");
	}
}
