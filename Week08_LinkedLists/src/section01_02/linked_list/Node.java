package section01_02.linked_list;

public class Node<E> {
	public E data;
	public Node<E> next;
	
	public Node(E data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}
