package section05_06.linked_list;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	
	private int size;
	
	public LinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	public LinkedList(E ... values) {
		//Fill out later.
	}
	
	public void addFirst(E data) {
		Node<E> temp = new Node<>(data);
		
		if (this.isEmpty()) {
			this.head = this.tail = temp;
		}
		else {
			temp.next = this.head;
			this.head = temp;
		}
		
		this.size++;
	}
	
	public boolean isEmpty() {
		return this.head == null && this.tail == null && this.size == 0;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node<E> current = this.head;
		
		while(current != null) {
//			if (current.next != null) {
//				sb.append(current + ", ");
//			}
//
//			else {
//				sb.append(current);
//			}
			sb.append(current + ", ");
			current = current.next;
		}
		
		return sb.substring(0, sb.length() - 2);
	}
}