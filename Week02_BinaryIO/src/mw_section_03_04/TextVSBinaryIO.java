package mw_section_03_04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextVSBinaryIO {
	public static void main(String[] args) {
		File inFile = new File("src/io_files/test.txt");
		
		try {
			PrintWriter pw = new PrintWriter(inFile);
			pw.print("199");
			
			pw.flush();
			pw.close();
			
			Scanner in = new Scanner(inFile);
			//System.out.println(in.next());
			
			in.close();
			
			File outFile2 = new File("src/io_files/test.bin");
			
			FileOutputStream fos = new FileOutputStream(outFile2);
			
			//fos.write(2147483647); //01111111 11111111 11111111 11111111
								     //127      255      255      255
			
			fos.write(127);
			fos.write(255);
			fos.write(255);
			fos.write(255);
			
			fos.flush();
			fos.close();
			
			FileInputStream fis = new FileInputStream(outFile2);
			
			System.out.println(fis.read());
			//unsigned byte: 0 -> 255 
			//signed byte: -128 -> 127
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
