package class_examples;

public class GenericArrayDataField <E> {
	private E[] arr;
	
	@SuppressWarnings("unchecked")
	public GenericArrayDataField() {
		this.arr = (E[]) new Object[10];
	}
	
}
