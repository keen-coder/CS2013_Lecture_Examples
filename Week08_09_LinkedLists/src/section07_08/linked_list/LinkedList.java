package section07_08.linked_list;

public class LinkedList<E> {
	private Node<E> head;
	private Node<E> tail;
	
	private int size;
	
	public LinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	public LinkedList(E ... values) {
		for (E value : values) {
			this.addLast(value);
		}
	}
	
	public void insert(int index, E value) {
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		if (index == 0) {
			this.addFirst(value);
		}
		else if (index == this.size) {
			this.addLast(value);
		}
		else {
			Node<E> temp = new Node<>(value);
			Node<E> current = this.head;
			int currentIndex = 0;
			
			while(currentIndex != (index - 1)) {
				current = current.next;
				currentIndex++;
			}
			
			temp.next = current.next;
			current.next = temp;
			this.size++;
		}
	}
	
	public E get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("ERROR");
		}
		
		Node<E> current = this.head;
		int currentIndex = 0;
		
		while(currentIndex != index) {
			current = current.next;
			currentIndex++;
		}
		
		return current.data;
	}
	
	public void addLast(E data) {
		Node<E> temp = new Node<>(data);
		
		if (this.isEmpty()) {
			this.head = this.tail = temp;
		}
		else {
			this.tail.next = temp;
			this.tail = temp;
		}
		
		this.size++;
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