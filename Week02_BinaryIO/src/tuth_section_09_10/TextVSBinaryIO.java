package tuth_section_09_10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TextVSBinaryIO {
	
	public static void main(String[] args) {
		File outFile1 = new File("src/io_files/test.txt");
		File outFile2 = new File("src/io_files/test.dat");
		
		try {
			PrintWriter pw = new PrintWriter(outFile1);
			pw.print("199");
			pw.flush();
			pw.close();
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile2));
			
			
			dos.write(42);
			dos.write(170);
			dos.write(170);
			dos.write(170);
			dos.write('\n');
			
			dos.writeInt(715827882);  // "00101010 10101010 10101010 10101010"
			   // 42	   170      170      170
			dos.write('\n');
			dos.writeLong(15834756846735L);
			
			dos.flush();
			dos.close();
			
//			FileInputStream fis = new FileInputStream(outFile2);
//			System.out.println(fis.read());
//			
			
			
			
			
			//unsigned byte: 0 -> 255
			//signed byte: -128 -> 127
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}