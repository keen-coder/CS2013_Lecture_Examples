package mw_section_05_06;

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
//			PrintWriter pw = new PrintWriter(outFile1);
//			
//			pw.print("199");
//			pw.flush();
//			pw.close();
//			
//			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile2));
//			dos.writeInt(2147483647); //-> 01111111 11111111 11111111 11111111
//								   //-> 127      255      255      255	
//		
//			
//			
//			dos.flush();
//			dos.close();
//			//unsigned byte: 0 -> 255
//			//signed byte: -128 -> 127
//			
//			DataInputStream dis = new DataInputStream(new FileInputStream(outFile2));
//			System.out.println("binary data output: " + dis.readInt());
//			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile2));
			dos.writeLong(Long.MAX_VALUE);
			dos.writeInt(Integer.MAX_VALUE);
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream(outFile2));
			System.out.println(dis.readUTF());
			System.out.println(dis.readLong());
			dis.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}