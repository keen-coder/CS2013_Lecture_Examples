package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class Wildcards {

	public static void main(String[] args) {
		ArrayList<Rectangle> rects = new ArrayList<>();
		ArrayList<Circle> circs = new ArrayList<>();
		
		upperBound(rects);
		upperBound(circs);
		
		ArrayList<String> strs = new ArrayList<>();
		ArrayList<Long> longs = new ArrayList<>();
		
		unbounded(rects);
		unbounded(circs);
		unbounded(strs);
		unbounded(longs);
//		
		ArrayList<Double> doubs = new ArrayList<>();
		ArrayList<Number> nums = new ArrayList<>();
		ArrayList<Object> objs = new ArrayList<>();
		
		lowerBound(doubs);
		lowerBound(nums);
		lowerBound(objs);
		
	}
	
	public static void unbounded(ArrayList<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
	
	public static void upperBound(ArrayList<? extends GeometricObject> list) {
		for(GeometricObject geo : list) {
			System.out.println(geo.getArea());
		}
	}
	
	public static void lowerBound(ArrayList<? super Double> list) {
		
	}
	
	
	
	
	
	

////	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 	
	 */
	
	

}
