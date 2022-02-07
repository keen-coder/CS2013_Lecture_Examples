package lecture_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream and FileOutputStream are classes that you want to use
// to read / write only bytes from / to file.  All of its methods are inherited from
// the parents InputStream and OutputStream.  FileInputStream and FileOutputStream
// do not introduce any new methods, they are just concrete subclasses of the 
// abstract parent classes.

public class FileInputAndOutputStreamExamples {

	public static void main(String[] args) {
		
		//Example of FileOutputStream
		try {
			FileOutputStream fos = new FileOutputStream(new File("output.dat"));
			
			//Writing a single byte of data to a file
			fos.write(117); //Will look like character 'u' because the text editor 
			                //interprets 117 as a unicode value.
			
			//Write an array of bytes to a file.
			byte[] byteArray = {124, 37, 42, 89, 26, 47, 66, 127};
			
			fos.write(byteArray);
			fos.flush();
			fos.close();
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
		//Example of FileInputStream
		try {
			FileInputStream fis = new FileInputStream(new File("output.dat"));
			
			//Reading one byte from the file.
			int firstByte = fis.read();
			System.out.println(firstByte);
			
			//Read an array of bytes from the file.
			byte[] byteArray = new byte[8];
			
			fis.read(byteArray);
			fis.close();
			
			for (int i = 0 ; i < byteArray.length ; i++) {
				System.out.println(byteArray[i]);
			}
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}