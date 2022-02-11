package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class NeedForWildCards {

	public static void main(String[] args) {
		ArrayList<GeometricObject> list1 = new ArrayList<>();
		ArrayList<Circle> circles = new ArrayList<>();
		ArrayList<Rectangle> rectangles = new ArrayList<>();
		
		method(list1);
		method(circles);
		method(rectangles);
	}
	
	public static void method(ArrayList<? extends GeometricObject> list) {
		
	}
	

}
