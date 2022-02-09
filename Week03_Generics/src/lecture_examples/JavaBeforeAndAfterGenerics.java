package lecture_examples;

import java.util.ArrayList;

public class JavaBeforeAndAfterGenerics {

	public static void main(String[] args) {
		//Before Generics was added.
		//Using a raw data type (Object)
		ArrayList list = new ArrayList();

		list.add("java");
		list.add("generics");

		Object s1 = list.get(0);

		if (s1 instanceof String) {
			int length = ((String)s1).length();
		}

		//Java after Generics.
		ArrayList<String> list2 = new ArrayList<>();

		list.add("java");
		list.add("generics");

		String s2 = list2.get(0);

		int length = s2.length();
	}
}
