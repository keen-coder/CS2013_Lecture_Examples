package class_examples;

public class BoundedGenericArrayDataField <E extends Comparable<E>> {
	private E[] arr;
	
	@SuppressWarnings("unchecked")
	public BoundedGenericArrayDataField() {
		this.arr = (E[]) new Comparable[10];
	}	
}