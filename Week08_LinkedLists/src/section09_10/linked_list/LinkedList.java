package section09_10.linked_list;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	
	private int size;
	
	public LinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	public LinkedList(E ... values) {
		//Finish later.
	}
	
	public void addFirst(E value) {
		this.size++;
		Node<E> temp = new Node<>(value);
		
		if (this.isEmpty()) {
			this.head = this.tail = temp;
		}
		else {
			temp.next = this.head;
			this.head = temp;
		}
	}
	
	public boolean isEmpty() {
		return this.head == null &&
			   this.tail == null &&
			   this.size == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node<E> current = this.head;
		
		while( current != null) {
			sb.append(current.data + ", ");
			current = current.next;
		}
		
		return sb.substring(0, sb.length() - 2);
	}
}
