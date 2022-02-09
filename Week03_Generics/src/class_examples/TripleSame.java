package class_examples;

public class TripleSame<T> {
	private T item1;
	private T item2;
	private T item3;
	
	public TripleSame(T item1, T item2, T item3) {
		super();
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}

	public T getItem1() {
		return item1;
	}

	public void setItem1(T item1) {
		this.item1 = item1;
	}

	public T getItem2() {
		return item2;
	}

	public void setItem2(T item2) {
		this.item2 = item2;
	}

	public T getItem3() {
		return item3;
	}

	public void setItem3(T item3) {
		this.item3 = item3;
	}

	@Override
	public String toString() {
		return "Triple [item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + "]";
	}
	
	
	
	
}
