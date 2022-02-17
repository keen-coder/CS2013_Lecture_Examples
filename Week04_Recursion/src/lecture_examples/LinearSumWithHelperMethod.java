package lecture_examples;

public class LinearSumWithHelperMethod {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(sumArray(arr));
	}
	
	public static int sumArray(int[] list) {
		return sumArray(list, list.length);
	}
	
	//Recursive Helper Method
	private static int sumArray(int[] list, int n) {
		
		//Base Case
		if (n == 0) {
			return 0;
		}
		
		//Recursive case
		else {
			return sumArray(list, n-1) + list[n-1];
		}
	}

}
