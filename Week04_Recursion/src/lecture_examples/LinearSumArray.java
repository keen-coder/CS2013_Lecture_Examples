package lecture_examples;

public class LinearSumArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(sumArray2(arr, arr.length, 0));
	}
	
//	public static int sumArray(int[] list, int n) {	
//		//Base Case
//		if (n == 0) {
//			return 0;
//		}
//		//Recursive case
//		else {
//			return sumArray(list, n-1) + list[n-1];
//		}
//	}
	
	public static int sumArray2(int[] list, int n, int result) {	
		//Base Case
		if (n == 0) {
			return result;
		}
		//Recursive case
		else {
			return sumArray2(list, n-1, result + list[n-1]);
		}
	}
}
