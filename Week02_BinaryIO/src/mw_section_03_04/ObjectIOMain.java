package mw_section_03_04;

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
		writeWaterBottleData();

		ArrayList<WaterBottle> bottles = readWaterBottleData();

		for (WaterBottle waterBottle : bottles) {
			System.out.println(waterBottle);
		}
		
		//Writing an arraylist to file.
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/io_files/arraylist.dat")));
		
			oos.writeObject(bottles);
		
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/io_files/arraylist.dat")));
			
			ArrayList<WaterBottle> bottleList = (ArrayList<WaterBottle>) ois.readObject();
			
			System.out.println("\n ArrayList From File:");
			for (WaterBottle waterBottle : bottleList) {
				System.out.println(waterBottle);
			}
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
	}



	public static ArrayList<WaterBottle> readWaterBottleData() {
		ArrayList<WaterBottle> bottles = new ArrayList<>();


		try {
			File inFile = new File("src/io_files/water_bottles.dat");
			FileInputStream fis = new FileInputStream(inFile);
			ObjectInputStream ois = new ObjectInputStream(fis);

			try {
				while(true) {
					WaterBottle nextBottle = (WaterBottle)ois.readObject(); //comes back as Object
					bottles.add(nextBottle);
				}
			}
			catch (EOFException ex) {
				System.out.println("File processed.");
			}
			
			ois.close();
			
			
		}
		


		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bottles;
	}

	public static void writeWaterBottleData() {
		WaterBottle wb1 = new WaterBottle("Hydro Flask", 24, 24.99, "blue");
		WaterBottle wb2 = new WaterBottle("Yeti", 32, 40.00, "black");
		WaterBottle wb3 = new WaterBottle("Nalgene", 64, 9.93, "red");

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/io_files/water_bottles.dat")));

			oos.writeObject(wb1);
			oos.writeObject(wb2);
			oos.writeObject(wb3);
			oos.flush();
			oos.close();

		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}



}
