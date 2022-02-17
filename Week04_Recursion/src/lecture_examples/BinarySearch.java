package lecture_examples;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 70, 80, 90, 100};
		int index = binarySearch(arr, 60, 0, arr.length-1);
		System.out.println(index);
	}
	
	public static int binarySearch(int[] list, int key, int low, int high) {
		if (low > high) { // The list has been exhausted without a match
			return -low - 1;
		}

		int mid = (low + high) / 2;

		if (key < list[mid]) {
			return binarySearch(list, key, low, mid - 1);
		}
		else if (key == list[mid]) {
			return mid;
		}
		else {
			return binarySearch(list, key, mid + 1, high);
		}
	}

}
