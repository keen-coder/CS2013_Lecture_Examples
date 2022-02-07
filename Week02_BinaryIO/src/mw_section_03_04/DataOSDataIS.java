package mw_section_03_04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOSDataIS {
	public static void main(String[] args) {
		File outFile2 = new File("src/io_files/test.bin");

		
		try {
			DataOutputStream fos = new DataOutputStream(new FileOutputStream(outFile2));

			fos.writeShort(2147483647); //01111111 11111111 11111111 11111111
		

			fos.flush();
			fos.close();
			
			DataInputStream fis = new DataInputStream(new FileInputStream(outFile2));

			System.out.println(fis.readShort());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		





	}
}
