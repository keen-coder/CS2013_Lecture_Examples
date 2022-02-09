package class_examples;

import java.util.ArrayList;

public class ListOfLists {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list2D = new ArrayList<>();
				
		
		list2D.add(new ArrayList<>());
		
		list2D.get(0).add(10);
		
		System.out.println(list2D.get(0).get(0));
				
		
	}
}
