package section05_06.tester;

import section05_06.linked_list.LinkedList;

public class LinkedListTester {
	
	public static void main(String[] args) {
		testAddFirst();
		
		
		
		

	}
	
	public static void testAddFirst() {
		System.out.println("Testing Add First------------------");
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);
		
		String expected = "50, 40, 30, 20, 10";
		String actual = list.toString();
		boolean isCorrect = expected.equals(actual);
		
		System.out.printf("%-15s %s\n" ,"Expected:", expected);
		System.out.printf("%-15s %s\n" ,"Actual:", actual);
		System.out.printf("%-15s %b\n" ,"isCorrect?:", isCorrect);

		System.out.println("End Testing Add First--------------------");
	}

}


























































//Node<Integer> n1 = new Node<>(10);
//Node<Integer> n2 = new Node<>(20);
//Node<Integer> n3 = new Node<>(30);
//Node<Integer> n4 = new Node<>(40);
//Node<Integer> n5 = new Node<>(50);
//Node<Integer> n6 = new Node<>(60);
//Node<Integer> n7 = new Node<>(70);
//Node<Integer> n8 = new Node<>(80);
//
//n1.next = n2;
//n2.next = n3;
//n3.next = n4;
//n4.next = n5;
//n5.next = n6;
//n6.next = n7;
//n7.next = n8;
//
//Node<Integer> head = n1;
//
////System.out.println("n1: " + n1);
////System.out.println("n1.next: " + n1.next);
////System.out.println("n2: " + n2);
//
//Node<Integer> current = head;
//
//while(current != null) {
//	System.out.print(current + " ");
//	current = current.next;
//}