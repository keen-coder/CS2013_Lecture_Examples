package lecture_examples;

public class PrintArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		printArr(arr, 0);
	}
	
	public static void printArr(int[] arr, int index) {
		if(arr.length == index) {
			return;
		}
		else {
			System.out.print(arr[index] + " ");
			printArr(arr, index + 1);
		}
		
	}

}
