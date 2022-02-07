package tuth_section_07_08;

import java.io.Serializable;

public class WaterBottle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String brand;
	private int size;
	private double price;
	private String color;
	
	
	
	public WaterBottle(String brand, int size, double price, String color) {
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", size=" + size + ", price=" + price + ", color=" + color + "]";
	}
}