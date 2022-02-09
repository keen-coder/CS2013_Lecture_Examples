package book_examples;

import java.io.File;
import java.util.ArrayList;

public class GenericMethodDemo {
	public static void main(String[] args ) {
		Integer[] integers = {1, 2, 3, 4, 5};
		String[] strings = {"London", "Paris", "New York", "Austin"};

		GenericMethodDemo.<Integer>print(integers);
		GenericMethodDemo.<String>print(strings);
		
		print(integers);
		print(strings);
		
	}

	public static <E> void print(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}	
			
		System.out.println();
	}
	
	
	
	
	
	
}