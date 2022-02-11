package class_examples;

public class BoundedTypeTest {

	public static void main(String[] args) {
		BoundedTypeClass<Number> test = 
				new BoundedTypeClass<>(12);
		
		BoundedTypeClass<Integer> test2 = 
				new BoundedTypeClass<>(12);
		
		BoundedTypeClass<Double> test3 = 
				new BoundedTypeClass<>(12.3);

		//Does not work.
		BoundedTypeClass<String> test4 = 
				new BoundedTypeClass<>("test");
	}

}