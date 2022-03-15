package section01_02.linked_list;

public class LinkedList<E> {
	public Node<E> head;
	public Node<E> tail;
	private int size;
	
	public LinkedList() {
		
	}
	
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public LinkedList(E ... values) {
		
	}
	
	public void addFirst(E value) {
		Node<E> newNode = new Node<E>(value);
		
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		}
		else {
			newNode.next = this.head;
			this.head = newNode;
		}
		
		this.size++;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> current = this.head;
		
		while(current != null) {
			sb.append(current + " ");
			current = current.next;
		}
		
		return sb.toString();
	}
	
	
	
	
}
