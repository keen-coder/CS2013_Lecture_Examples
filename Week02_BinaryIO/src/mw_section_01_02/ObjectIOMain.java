package mw_section_01_02;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIOMain {
	public static void main(String[] args) {
		writeObjectData();
		
		ArrayList<WaterBottle> wbs = readObjectData();
		
		for (WaterBottle wb : wbs) {
			System.out.println(wb);
		}
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/io_files/arraylist_bottles.dat"));
			oos.writeObject(wbs);
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/io_files/arraylist_bottles.dat"));
			ArrayList<WaterBottle> copyList = (ArrayList<WaterBottle>) ois.readObject();
			System.out.println();
			for (WaterBottle wb : copyList) {
				System.out.println(wb);
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
		ArrayList<WaterBottle> list = new ArrayList<>();
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/io_files/water_bottles.dat"));
		
			while(true) {
				WaterBottle nextBottle = (WaterBottle)ois.readObject(); //retuns data as Object
				
				list.add(nextBottle);
			}
		
		
		} 
		catch (EOFException ex) {
			System.out.println("File processed.");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;	
	}
	
	public static void writeObjectData() {
		WaterBottle wb1 = new WaterBottle("Hydro Flask", 24, 24.99, "blue");
		WaterBottle wb2 = new WaterBottle("Yeti", 32, 40.00, "black");
		WaterBottle wb3 = new WaterBottle("Nalgene", 64, 9.93, "red");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/io_files/water_bottles.dat"));
			
			oos.writeObject(wb1);
			oos.writeObject(wb2);
			oos.writeObject(wb3);
			oos.flush();
			oos.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
