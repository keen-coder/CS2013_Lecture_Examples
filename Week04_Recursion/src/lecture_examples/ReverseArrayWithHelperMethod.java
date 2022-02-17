package lecture_examples;

import java.util.Arrays;

public class ReverseArrayWithHelperMethod {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		reverse(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	public static void reverse(int[] list) {
		reverse(list, 0, list.length-1);
	}

	private static void reverse(int[] list, int low, int high) {
		if (low >= high) {
			return;
		}
		else {
			int temp = list[low];
			list[low] = list[high];
			list[high] = temp;
			reverse(list, low + 1, high - 1); 
		}

	}
}
