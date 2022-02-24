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

		int nTerms = 50;
		
		long[] memo = new long[nTerms + 1];
		
		//allFibSlow(nTerms);
		allFibFast(nTerms, memo);
	}

	public static void allFibSlow(long maxIndex) {
		//Slow Fib
		for (int i = 0 ; i <= maxIndex ; ++i) {
			long start = System.currentTimeMillis();
			long current = fib(i);
			long end = System.currentTimeMillis();
		
			System.out.println("Term " + i + ": " + current  + ", Time: " + (end - start) + "ms");
		}
	}
	
	public static void allFibFast(long maxIndex, long[] memo) {
		//Slow Fib
		for (int i = 0 ; i <= maxIndex ; ++i) {
			long start = System.currentTimeMillis();
			long current = betterFib(i, memo);
			long end = System.currentTimeMillis();
		
			System.out.println("Term " + i + ": " + current  + ", Time: " + (end - start) + "ms");
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
	

	//Memoization
	private static long betterFib(long index, long[] memo) {
		if(index == 0){
			return 0;
		}
		else if(index == 1){
			return 1;
		}
		else if (memo[(int)index] != 0) {
			return memo[(int)index];
		}
		else {  // Reduction and recursive calls
			long result = betterFib(index - 1, memo) + betterFib(index - 2, memo);
			memo[(int)index] = result;
			return result;
		}
	}
}