package lecture_examples;

import java.util.Scanner;

public class ComputeFibonacci {
	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter an index for a Fibonacci number: ");
//		int index = input.nextInt();
//
//		System.out.println("The Fibonacci number at index "  
//				+ index + " is " + fib(index));
		
		allFib(50);
	}
	
	public static void allFib(long maxIndex) {
		for (int i = 0 ; i <= maxIndex ; ++i) {
			System.out.println(fib(i) + " ");
		}
	}

	//Another example of binary recursion
	public static long fib(long index) {
		if (index == 0) { // Base case
			return 0;
		}
		else if (index == 1) { // Base case
			return 1;
		}
		else {  // Reduction and recursive calls
			return fib(index - 1) + fib(index - 2);
		}
	}
}
