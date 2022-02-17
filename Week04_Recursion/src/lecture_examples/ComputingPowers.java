package lecture_examples;

public class ComputingPowers {
	
	public static void main(String[] args) {
		System.out.println(power(2, 8));
	}

	public static int power(int x, int n) {
		//Base Case
		if (n == 0) {
			return 1;
		}
		//Recursive Case
		else {
			return x * power(x, n-1);
		}
	}
}
