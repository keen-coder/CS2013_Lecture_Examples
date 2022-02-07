package tuth_section_09_10;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) {


		long start1 = System.currentTimeMillis();
		slowReader();
		long end1 = System.currentTimeMillis();

		long start2 = System.currentTimeMillis();
		fastReader();
		long end2 = System.currentTimeMillis();

		System.out.println("slow reader time: " + (end1 - start1) + "ms");
		System.out.println("fast reader time: " + (end2 - start2) + "ms");



	}

	public static void slowReader() {
		System.out.println("Starting Slow Reader....");
		try {
			FileInputStream fis = new FileInputStream("src/io_files/lots_of_data.dat");

			int data = 0; 
			do {
				data = fis.read();
			} while(data != -1);
			fis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fastReader() {
		System.out.println("Starting Fast Reader....");
		try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/io_files/lots_of_data.dat"));

			int data = 0; 
			do {
				data = bis.read();
			} while(data != -1);
			bis.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






}
