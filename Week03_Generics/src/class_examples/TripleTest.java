package class_examples;

public class TripleTest {

	public static void main(String[] args) {
		TripleSame<Double> trip1 = new TripleSame<>(3.4, 2.7, 2.6);
		TripleSame<String> trip2 = new TripleSame<>("java", "c#", "python");
		System.out.println(trip1);
		System.out.println(trip2);
			
		TripleDifferent<String, Integer, Double> trip3 = new TripleDifferent<>("java", 7, 3.5);
		System.out.println(trip3);
		
		TripleDifferent<String, String, String> trip4 = new TripleDifferent<>("java", "c++", "c#");
		System.out.println(trip4);

	}

}
