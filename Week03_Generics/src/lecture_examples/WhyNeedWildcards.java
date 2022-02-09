package lecture_examples;

import java.util.ArrayList;

public class WhyNeedWildcards {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(3.14);
		doubleList.add(87.02);
		doubleList.add(33.99);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("java");
		strList.add("python");
		strList.add("c++");
		
		myMethod(intList);
		myMethod(doubleList);
		myMethod(strList);
		
				

	}
	
	public static void myMethod(ArrayList<? extends Number> numList) {
		
	}
	
	
	
	
	
	
	
	

}
