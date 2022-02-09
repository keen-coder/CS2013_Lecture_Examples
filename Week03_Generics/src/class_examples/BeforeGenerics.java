package class_examples;

import java.util.ArrayList;

public class BeforeGenerics {
//Object
	public static void main(String[] args) {
		ArrayList myList = new ArrayList(); //using a Raw Type.
	
		myList.add("hello");
		myList.add(3.5);	
		myList.add(12);
	
		int x = (int)myList.get(0);

	}

}