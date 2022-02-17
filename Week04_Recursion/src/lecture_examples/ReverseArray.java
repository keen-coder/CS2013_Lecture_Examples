package lecture_examples;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		reverse(list, 0, list.length-1);
		System.out.println(Arrays.toString(list));
	}
	
	public static void reverse(int[] list, int low, int high) {
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
