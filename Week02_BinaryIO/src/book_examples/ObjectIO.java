package book_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

	public static void main(String[] args) {
		Cereal c1 = new Cereal("Cap'n Crunch", "Quaker Oats Company", 14.0);
		Cereal c2 = new Cereal("Count Chocula", "General Mills", 10.7);
		Cereal c3 = new Cereal("Frosted Mini Wheats", "Kellogs", 19.0);

		Cereal c4 = null, c5 = null, c6 = null;

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.dat"));

			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.writeObject(c3);

			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));

			//Have to cast to the object you are reading
			c4 = (Cereal) ois.readObject();
			c5 = (Cereal) ois.readObject();
			c6 = (Cereal) ois.readObject();

			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c4);
		System.out.println();
		System.out.println(c5);
		System.out.println();
		System.out.println(c6);
	}
}
