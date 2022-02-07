package mw_section_01_02;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class TextVsBinaryIO {
	public static void main(String[] args) {
		DataInputStream b = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(""))));
		
		b.
		
		
		File outFile1 = new File("src/io_files/test.txt");
		File outFile2 = new File("src/io_files/test.dat");
		
		//ctrl + shift + o   NOT 0 (zero)
		
		byte[] bArr = {67, 65, 84};
		
		//125593
		
		
		
		try {
			PrintWriter pw = new PrintWriter(outFile1);
			
			pw.println("199");
			pw.flush();
			pw.close();
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile2));
			dos.writeInt(125593);	//00000000 00000001 11101010 10011001‬	
			dos.flush();
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream(outFile2));
			
			System.out.println(dis.readInt());
			dis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
