package section03_04.linked_list;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public LinkedList(E ... values) {
		//Add each value to the list
	}
	
	public void addFirst(E value) {
		Node<E> newNode = new Node<>(value);
		
		if (this.isEmpty()) {
			this.head = this.tail = newNode;
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
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node<E> temp = this.head;
		
		while(temp != null) {
			sb.append(temp + ", ");
			temp = temp.next;
		}
		
		return sb.substring(0, sb.length() - 2);
	}
	
	
	
	
	
	
	
}
