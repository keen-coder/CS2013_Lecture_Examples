package lecture_examples;

public class Print2DArray {

	public static void main(String[] args) {
		int[][] data = {{1, 2, 3, 4}, 
						{5, 6, 7, 8}, 
						{9, 10, 11, 12},
						{13, 14, 15, 16},
						{17, 18, 19, 20}};
		
		//print2DArr(data, 0, 0, 1, 1);
		print2DArr(data, 0, 0, 1, 2);
	}
	
	public static void print2DArr(int[][] data, int rowIndex, 
			int colIndex, int rowStep, int colStep) {
		if (rowIndex >= data.length) {
			return;
		}
		else if(colIndex >= data[rowIndex].length) {
			System.out.println();
			print2DArr(data, rowIndex + rowStep, 0, rowStep, colStep);
		}
		else {
			System.out.print(data[rowIndex][colIndex] + " ");
			print2DArr(data, rowIndex, colIndex + colStep, rowStep, colStep);
		}
		
	}

}
