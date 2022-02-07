package tuth_section_07_08;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIOMain {
	
	public static void main(String[] args) {
		writeObjectData();
		
		ArrayList<WaterBottle> bottles = readObjectData();
		
		for (WaterBottle waterBottle : bottles) {
			System.out.println(waterBottle);
		}
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/io_files/arraylist.dat")));
		
			oos.writeObject(bottles);
			oos.close();
		
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/io_files/arraylist.dat")));
			ArrayList<WaterBottle> copy = (ArrayList<WaterBottle>) ois.readObject();
			ois.close();
			
			System.out.println("\nArrayList from File");
			for (WaterBottle waterBottle : copy) {
				System.out.println(waterBottle);
			}
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static ArrayList<WaterBottle> readObjectData() {
		File inFile = new File("src/io_files/water_bottles.dat");
		ArrayList<WaterBottle> bottles = new ArrayList<>();
		
		try {
			FileInputStream fis = new FileInputStream(inFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				while(true) {
					WaterBottle nextBottle = (WaterBottle)ois.readObject(); //returns an Object
					bottles.add(nextBottle);
				}
			}
			catch(EOFException ex) {
				System.out.println("All object data processed.");
			} 
			
		}
		catch(FileNotFoundException ex) {
			
		} 
		catch (IOException e) {
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bottles;
	}
	
	
	public static void writeObjectData() {
		WaterBottle wb1 = new WaterBottle("Hydro Flask", 24, 24.99, "blue");
		WaterBottle wb2 = new WaterBottle("Yeti", 32, 40.00, "black");
		WaterBottle wb3 = new WaterBottle("Nalgene", 64, 9.93, "red");
		
		File outFile = new File("src/io_files/water_bottles.dat");
		
		try {
			FileOutputStream fos = new FileOutputStream(outFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(wb1);
			oos.writeObject(wb2);
			oos.writeObject(wb3);
			
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}


}
