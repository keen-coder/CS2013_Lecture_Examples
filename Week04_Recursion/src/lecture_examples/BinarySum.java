package lecture_examples;

public class BinarySum {
	public static int binarySum(int[] list, int low, int high) {
		if (low > high) {
			return 0;
		}
		else if (low == high) {
			return list[low];
		}
		else {
			int mid = (low + high) / 2;
			return binarySum(list, low, mid) + binarySum(list, mid+1, high);
		}
	}
}
