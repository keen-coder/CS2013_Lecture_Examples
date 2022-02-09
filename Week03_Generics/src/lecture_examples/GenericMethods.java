package lecture_examples;

public class GenericMethods {

	public static void main(String[] args) {
		
		genericSort(1, 2, 3);
		genericSort("java", "python", "c++");
		genericSort(4.5, 100.952, 1.67);
		
		MyObject mo1 = new MyObject();
		MyObject mo2 = new MyObject();
		MyObject mo3 = new MyObject();
		
		genericSort(mo1, mo2, mo3); 
		
	}
	//extends
	public static <T extends Comparable<T>> void genericSort(T item1, T item2, T item3) {
		
	}
	
	
	
}
