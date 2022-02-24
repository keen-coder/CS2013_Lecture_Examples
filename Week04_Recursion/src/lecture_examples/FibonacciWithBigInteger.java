package lecture_examples;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciWithBigInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the max index term you want to compute: ");
		int maxIndex = in.nextInt();
		allFibFast(maxIndex);
	}
	
	public static void allFibFast(int maxIndex) {
		BigInteger[] memo = new BigInteger[maxIndex + 1];
		Arrays.fill(memo, BigInteger.ZERO);
		allFibFast(maxIndex, memo);
	}
	
	private static void allFibFast(int maxIndex, BigInteger[] memo) {
		for (int i = 0 ; i <= maxIndex ; ++i) {
			long start = System.currentTimeMillis();
			BigInteger current = betterFib(i, memo);
			long end = System.currentTimeMillis();
		
			System.out.println("Term " + i + ": " + current  + ", Time: " + (end - start) + "ms");
		}
	}
	
	private static BigInteger betterFib(int index, BigInteger[] memo) {
		if(index == 0){
			return BigInteger.ZERO;
		}
		else if(index == 1){
			return BigInteger.ONE;
		}
		else if (!memo[index].equals(BigInteger.ZERO)) {
			return memo[index];
		}
		else {  // Reduction and recursive calls
			BigInteger result = betterFib(index - 1, memo).add(betterFib(index - 2, memo));
			memo[index] = result;
			return result;
		}
	}

}
