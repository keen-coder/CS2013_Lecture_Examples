package lecture_examples;

public class HiddenBaseCase {
	public static void main(String[] arg) {
		System.out.println(recursiveFactorial2(5));
	}
	
	public static int recursiveFactorial2(int n) {
		if (n != 0) {
			return n * recursiveFactorial2(n - 1);
		}
		return 1;
	}
	
	public static int recursiveFactorial(int n) {
		//Base Case
		if (n == 0) {
			return 1;
		}
		//Recursive Case
		else {
			return n * recursiveFactorial(n - 1); //<--Recursive method call.
			                                      //n is reduced by 1 until it reaches 0.
		}
	}
	
	
	
}
