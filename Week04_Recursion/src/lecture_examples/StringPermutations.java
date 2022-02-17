package lecture_examples;

public class StringPermutations {
	public static void main(String[] args) {
		
	}

	public static void permutate(String prefix, String str) {
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
