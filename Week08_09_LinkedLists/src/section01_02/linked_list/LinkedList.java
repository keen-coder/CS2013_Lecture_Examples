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
		for (E value : values) {
			this.addLast(value);
		}
	}
	
	public void delete(int index) {
		if (this.isEmpty()) {
			throw new IllegalStateException("List is Empty.");
		}
		
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("ERROR index " + index + " is out of bounds.");
		}
		
		if (index == 0) {
			this.deleteFirst();
		}
		else if (index == this.size - 1) {
			this.deleteLast();
		}
		else {
			Node<E> previous = this.head;
			int currentIndex = 0;
			
			while(currentIndex < index - 1) {
				previous = previous.next;
				currentIndex++;
			}
			
			previous.next = previous.next.next;
			
			this.size--;
		}
		
	}
	
	public void deleteLast() {
		if (this.isEmpty()) {
			throw new IllegalStateException("List is Empty.");
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
		if (this.isEmpty()) {
			throw new IllegalStateException("List is Empty.");
		}
		
		if (this.size == 1) {
			this.head = this.tail = null;
		}
		else {
			this.head = this.head.next;
		}
		
		this.size--;
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

	public void addLast(E value) {
		Node<E> temp = new Node<>(value);

		if (isEmpty()) {
			this.head = this.tail = temp;
		}
		else {
			this.tail.next = temp;
			this.tail = temp;
		}

		this.size++;
	}

	public E get(int index) {
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException("ERROR index " + index + " is out of bounds.");
		}

		int currentIndex = 0;
		Node<E> current = this.head;

		while(currentIndex < index) {
			current = current.next;
			currentIndex++;
		}

		return current.data;
	}
	
	public void insert(int index, E value) {
		if (index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException("ERROR index " + index + " is out of bounds.");
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
			
			while(currentIndex < (index - 1)) {
				current = current.next;
				currentIndex++;
			}
			
			temp.next = current.next;
			current.next = temp;
			
			this.size++;
		}
		
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> current = this.head;

		if(!this.isEmpty()) {
			sb.append(current);
			current = current.next;
		}

		while(current != null) {
			sb.append(", " + current);
			current = current.next;
		}
		//10, 20, 30, 40, 50, 
		return sb.toString();
	}




}
