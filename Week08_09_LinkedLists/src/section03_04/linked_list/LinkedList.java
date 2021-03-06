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
		for(E value : values) {
			this.addLast(value);
		}
	}
	
	public void delete(int index) {
		if (this.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		
		if (index == 0) {
			this.deleteFirst();
		}
		else if (index == (this.size - 1) ) {
			this.deleteLast();
		}
		else {
			Node<E> current = this.head;
			int currentIndex = 0;
			
			while(currentIndex < (index - 1) ) {
				current = current.next;
				currentIndex++;
			}
			
			current.next = current.next.next;
			this.size--;
		}
	}
	
	public void deleteLast() {
		if (this.isEmpty()) {
			throw new IllegalStateException("List is empty.");
		}
		
		if (this.size == 1) {
			this.head = this.tail = null;
		}
		else {
			Node<E> current = this.head;
			Node<E> previous = this.head;
			
			while(current.next != null) {
				previous = current;
				current = current.next;
			}
			
			previous.next = null;
			this.tail = previous;
		}
		
		this.size--;
		
		
		
	}
	
	public void deleteFirst() {
		if(this.isEmpty()) {
			throw new IllegalStateException("List is empty.");
		}
		
		if (this.size == 1) {
			this.head = this.tail = null;
		}
		else {
			this.head = this.head.next;
		}
		
		this.size--;
	}
	
	public void insert(int index, E value) {
		if (index < 0  || index > this.size) {
			throw new IndexOutOfBoundsException("ERROR: Index value is out of bounds.");
		}
		
		if (index == 0) {
			this.addFirst(value);
		}
		else if(index == this.size) {
			this.addLast(value);
		}
		else {
			Node<E> temp = new Node<>(value);
			Node<E> current = this.head;
			int currentIndex = 0;
			
			while (currentIndex < (index - 1)) {
				current = current.next;
				currentIndex++;
			}
			
			temp.next = current.next;
			current.next = temp;
			
			this.size++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public void addLast(E value) {
		Node<E> temp = new Node<>(value);
		
		if (this.isEmpty()) {
			this.head = this.tail = temp;
		}
		else {
			this.tail.next = temp;
			this.tail = temp;
		}
		
		this.size++;
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
	
	public E get(int index) throws IndexOutOfBoundsException {
		if (index < 0  || index >= this.size) {
			throw new IndexOutOfBoundsException("ERROR: Index value is out of bounds.");
		}
		
		int currentIndex = 0;
		Node<E> current = this.head;
		
		while(currentIndex != index) {
			current = current.next;
			currentIndex++;
		}
		
		return current.data;
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		if (this.isEmpty()) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();
		
		Node<E> temp = this.head;
		
		while(temp != null) {
			sb.append(temp + ", ");
			temp = temp.next;
		}
		
		return sb.substring(0, sb.length() - 2);
	}
	
	
	
	
	
	
	
}
