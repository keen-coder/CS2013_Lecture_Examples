package lecture_examples;

public class StringPermutationsWithHelperMethod {

	public static void main(String[] args) {
		permutate("eat");
	}
	
	public static void permutate(String str) {
		permutate("", str);
	}

	//Recursive Helper Method
	private static void permutate(String prefix, String str) {
		if (str.isEmpty()) {
			System.out.println(prefix);
		}
		else {			
			for (int i = 0 ; i < str.length() ; ++i) {
				permutate(prefix + str.charAt(i), 
						str.substring(0, i) + str.substring(i+1));	
			}
		}
	}
	
	
	
	
	
	
}