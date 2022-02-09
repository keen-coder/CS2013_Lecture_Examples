package lecture_examples;
//Type Parameters: E (element), T (single type), K/V (key / value pair)

public class MyGenericClass<T> {
	private String str;
	private T item;
	
	public MyGenericClass(String str, T item) {
		this.str = str;
		this.item = item;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
	
}
