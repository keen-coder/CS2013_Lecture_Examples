package section07_08.linked_list;

public class Node<E> {
	protected E data;
	public Node<E> next;
	
	public Node(E data) {
		this.data = data;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
}
