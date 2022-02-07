package lecture_examples;

import java.io.Serializable;

//To use Object IO your class must implement the Serializable interface and 
// have a private static final long serialVersionUID data field.  
//  All datafields must also be serializable.
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private long cin;
	private String favColor;
	private double x;
	
	public Person(String name, long cin, String favColor, double x) {
		super();
		this.name = name;
		this.cin = cin;
		this.favColor = favColor;
		this.x = x;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", cin=" + cin + ", favColor=" + favColor + ", x=" + x + "]";
	}
	
	
	

}
