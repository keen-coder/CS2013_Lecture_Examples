package lecture_examples;

public class Factorial {

	public static void main(String[] args) {
		//Add your own code here to play around with the methods.
	}
	
	public static int iterativeFactorial(int n) {
		int result = 1;
		
		for (int i = n ; i >= 2 ; i--) {
			result *= i;
		}
		
		return result;
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
