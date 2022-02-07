package lecture_examples;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectIOExampleWithPerson {
	public static void main(String[] args) {
		individualObjectExample();
		objectIOWithWholeArrayList();
	}

	public static void individualObjectExample() {
		//Create some person objects.
		Person p1 = new Person("John", 574635, "blue", 89.45);
		Person p2 = new Person("Sue", 6543467, "red", 100.2);
		Person p3 = new Person("Jim", 87654323, "gold", 56.0);
		Person p4 = new Person("Karen", 9876543456765L, "brown", 1000.34);
		Person p5 = new Person("Bob", 3454, "maroon", 1.5);

		//Add each person to an ArrayList
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);


		try {
			//Create an object output stream
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.dat"));

			//Write each object in the ArrayList to the file
			for (int i = 0 ; i < people.size(); i++) {
				oos.writeObject(people.get(i));
			}

			oos.flush();
			oos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Reading the data back.

		try {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("people.dat"))));

			try {
				while(true) {
					Person p = (Person)(ois.readObject());
					System.out.println(p);
				}
			}
			catch (EOFException ex) {
				System.out.println("End of file reached.");
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}








	}

	public static void objectIOWithWholeArrayList() {
		//Create some person objects.
		Person p1 = new Person("John", 574635, "blue", 89.45);
		Person p2 = new Person("Sue", 6543467, "red", 100.2);
		Person p3 = new Person("Jim", 87654323, "gold", 56.0);
		Person p4 = new Person("Karen", 9876543456765L, "brown", 1000.34);
		Person p5 = new Person("Bob", 3454, "maroon", 1.5);

		//Add each person to an ArrayList
		ArrayList<Person> people = new ArrayList<>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people2.dat"));

			//Write the entire ArrayList in one line.
			oos.writeObject(people);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("people2.dat")));

			ArrayList<Person> result = (ArrayList<Person>) ois.readObject();

			for (int i = 0 ; i < result.size(); i++) {
				System.out.println(result.get(i));
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
