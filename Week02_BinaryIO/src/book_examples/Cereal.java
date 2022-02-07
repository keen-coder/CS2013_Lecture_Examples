package book_examples;


import java.io.Serializable;

public class Cereal implements Serializable { 

	private static final long serialVersionUID = 1L;
	
	//must implement serializable
	private String name;
	private String brand;
	private double ounces;
	
	public Cereal(String name, String brand, double ounces) {
		this.name = name;
		this.brand = brand;
		this.ounces = ounces;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String getName() {
		return name;
	}



	public String getBrand() {
		return brand;
	}



	public double getOunces() {
		return ounces;
	}



	public String toString() {
		String output = "";
		
		output += "Name:\t\t" + this.name +"\n" +
				  "Brand:\t\t" + this.brand +"\n" +
				  "Ounces:\t\t" + this.ounces + "oz.";
		
		return output;
	}
}
