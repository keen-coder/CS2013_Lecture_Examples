package class_examples;

public class GenericMethodExample<E> {
	private E[] arr;
	
	public GenericMethodExample(E[] arr) {
		this.arr = arr;
	}
		
	//This is NOT a generic method
	public E[] getArr() {
		return this.arr;
	}
	
	//This IS a generic method
	//Generic methods can be in a generic class or in a non-generic class.
	//Generic methods can do everything a normal method can do.
	public <T> void myGenericMethod(T data) {
		T copy = data;
		System.out.println(copy);
	}
	
	
	
	
}
