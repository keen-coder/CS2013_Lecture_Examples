package section03_04.linked_list;

public class DoublyLinkedNode<E> {
	public E data;
	public Node<E> next;
	public Node<E> prev;
	
	public DoublyLinkedNode(E data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
