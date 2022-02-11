package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class WildcardRestrictions {

	public static void main(String[] args) {
		upper(new ArrayList<Circle>());
		upper(new ArrayList<Rectangle>());
		upper(new ArrayList<GeometricObject>());
		
		lower(new ArrayList<Circle>());
		lower(new ArrayList<GeometricObject>());
		lower(new ArrayList<Object>());
	}
	
	public static void lower(ArrayList<? super Circle> list) {
		Object o = list.get(0);
		
		list.add(new Circle());
	}
	
	public static void upper(ArrayList<? extends GeometricObject> list) {
		GeometricObject geo = list.get(0);
		//Cannot add anything to an upperbound wildcard
		list.add(new Circle());
		list.add(new Rectangle());
		list.add(geo);
	}
	
	
	

}
