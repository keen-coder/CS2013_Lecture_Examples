package book_examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFiles {
	public static void main(String[] args) throws IOException {
		
		File sourceFile = new File("temp.dat");
		
		if (!sourceFile.exists()) {
			System.out.println("Source file does not exist");
			System.exit(2);
		}
		
		File targetFile = new File("copy.dat");
		if (!targetFile.exists()) {
			System.out.println("Source file does not exist");
			System.exit(3);
		}
//		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));
		
		//6848, 6524ms
//		FileInputStream input = new FileInputStream(sourceFile);
//		FileOutputStream output = new FileOutputStream(targetFile);

		long start = System.currentTimeMillis();
		int r, numberOfBytesCopied = 0;
		while ((r = input.read() ) != -1) {
			output.write((byte)r);
			numberOfBytesCopied++;
		}
		long end = System.currentTimeMillis();
		
		long time = end - start;
		
		input.close();
		output.close();
		//Display the file size
		System.out.println(numberOfBytesCopied + " bytes copied");
		System.out.println(time + "ms");
	}
}

