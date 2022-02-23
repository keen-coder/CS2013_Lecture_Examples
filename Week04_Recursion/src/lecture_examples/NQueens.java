package lecture_examples;
import java.util.Scanner;


public class NQueens {
	
	//NOTE: You may not use static variables in your recursive homework.
	//You must figure out how to pass information using method parameters and return statements.
	private static int solutionNumber = 0;
	
	public static void main(String args[]) { 
		Scanner in = new Scanner(System.in);
		System.out.print("How many rows does the chess board have: ");
		int size = in.nextInt();
		
		char[][] board = new char[size][size];
		initBoard(board);
		solve(board);
	}
	
	//Initializes the board with empty spaces. '*' represents an empty space.
	public static void initBoard(char[][] board) {
		for (int i = 0 ; i < board.length ; ++i) {
			for (int j = 0 ; j < board[i].length ; ++j) {
				board[i][j] = '*';
			}
		}
	}
	
	public static void solve(char[][] board) {
		solve(board, 0, 0);
		if (solutionNumber == 0) {
			System.out.println("No solution");
		}
	}
	
	//Recursive Helper Method
	private static void solve(char[][] board, int currentRow, int queensPlaced) {
		//Base Case
		if (queensPlaced == board.length) {
			System.out.println("\nSolution " + ++solutionNumber);
			printBoard(board);
		}	 
		else {//Recursive case
			for (int currentColumn = 0 ; currentColumn < board[currentRow].length ; ++currentColumn) {
				if (isSafe(board, currentRow, currentColumn)) {
					//place the queen
					board[currentRow][currentColumn] = 'Q';
					queensPlaced++;
					
					//Recurse to next row	
					solve(board, currentRow + 1, queensPlaced);
					
					//Backtracking step (happens if we came back from the previous recursive call.
					//Means that the queen that was just placed could not work in the current solution.
					//Remove the queen placed at this level of recursion
					board[currentRow][currentColumn] = '*';
					queensPlaced--;
				}
				
				
				
			}
		}
	}
	
	//Method which checks to see if a placed queen is safe in her position.
	//A newly placed queen is safe if she does not share the same row, col, or diagonal as another queen.
	private static boolean isSafe(char[][] board, int row, int col) {

		
		//Check to see if there are any queens in the current column.
		for (int i = 0 ; i < board.length ; ++i) {
			if (board[i][col] == 'Q') {
				return false;
			}
		}
		
		//Check the upper major diagonal.
		for (int i = row, j = col ; i >= 0 && j >= 0 ; --i, --j) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		
		//Check the lower major diagonal
		for (int i = row, j = col ; i < board.length && j < board[row].length ; ++i, ++j) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		
		//Check the upper minor diagonal
		for (int i = row, j = col ; i >= 0 && j < board[row].length ; --i, ++j) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		
		//Check the lower minor diagonal
		for (int i = row, j = col ; i < board.length && j >= 0 ; ++i, --j) {
			if (board[i][j] == 'Q') {
				return false;
			}
		}
		
		return true;
	}

	//Prints out the board.
	public static void printBoard(char[][] board) {
		for (int row = 0; row < board.length; row++) { 
			for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " "); 
			}
			System.out.println(); 
		} 
	}
}