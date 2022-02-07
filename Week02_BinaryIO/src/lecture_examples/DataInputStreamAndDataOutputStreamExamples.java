package lecture_examples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamAndDataOutputStreamExamples {

	public static void main(String[] args) {
		writeFilteredDataExample();
		readFilteredDataExample();
	}
	
	
	public static void writeFilteredDataExample() {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File("output2.dat")));

			//writing a boolean to the file
			dos.writeBoolean(true);
			
			//writing a char to the file
			dos.writeChar('@');
			
			//writing a double to the file
			dos.writeDouble(Math.PI);
			
			//writing an int to the file
			dos.writeInt(36354637);
			
			//writing a string to the file.
			dos.writeUTF("the quick brown fox jumped over the lazy dog");
		
			//flush and close stream
			dos.flush();
			dos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void readFilteredDataExample() {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(new File("output2.dat")));
			
			//reading a boolean from the file
			boolean b1 = dis.readBoolean();
			System.out.println(b1);
			
			//reading a char from the file
			char ch1 = dis.readChar();
			System.out.println(ch1);
			
			//reading a double from the file
			double pi = dis.readDouble();
			System.out.println(pi);
			
			//reading an int from the file
			int i = dis.readInt();
			System.out.println(i);
			
			//reading a string from the file.
			String s = dis.readUTF();
			System.out.println(s);
			
			//close stream
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
