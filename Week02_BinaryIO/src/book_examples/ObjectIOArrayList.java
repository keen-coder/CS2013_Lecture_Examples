package book_examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIOArrayList {

	public static void main(String[] args) {
		Cereal c1 = new Cereal("Cap'n Crunch", "Quaker Oats Company", 14.0);
		Cereal c2 = new Cereal("Count Chocula", "General Mills", 10.7);
		Cereal c3 = new Cereal("Frosted Mini Wheats", "Kellogs", 19.0);

		ArrayList<Cereal> cerealList = new ArrayList<>();
		ArrayList<Cereal> cerealList2 = null;
		
		cerealList.add(c1);
		cerealList.add(c2);
		cerealList.add(c3);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cereal_list.dat"));

			oos.writeObject(cerealList);
			
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cereal_list.dat"));

			//Have to cast to the object you are reading
			cerealList2 = (ArrayList<Cereal>) ois.readObject();

			ois.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		for(Cereal c : cerealList2) {
			System.out.println(c);
			System.out.println();
		}
	
	}
}
