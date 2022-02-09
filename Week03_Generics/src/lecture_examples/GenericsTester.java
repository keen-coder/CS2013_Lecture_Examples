package lecture_examples;

public class GenericsTester {

	public static void main(String[] args) {
		MyGenericClass<Integer> gen1 = new MyGenericClass<>("java", 17);
		MyGenericClass<Boolean> gen2 = new MyGenericClass<>("python", true);
		
		Pair<Integer, Integer> pair1 = new Pair<>(100, 78);
		Pair<String, Character> pair2 = new Pair<>("Generics", 'A');
		
		
		

	}

}
