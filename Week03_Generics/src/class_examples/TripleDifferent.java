package class_examples;

public class TripleDifferent<T1, T2, T3> {
	private T1 item1;
	private T2 item2;
	private T3 item3;
	
	private int id;
	
	public TripleDifferent(T1 item1, T2 item2, T3 item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public T1 getItem1() {
		return item1;
	}
	public void setItem1(T1 item1) {
		this.item1 = item1;
	}
	public T2 getItem2() {
		return item2;
	}
	public void setItem2(T2 item2) {
		this.item2 = item2;
	}
	public T3 getItem3() {
		return item3;
	}
	public void setItem3(T3 item3) {
		this.item3 = item3;
	}
	
	@Override
	public String toString() {
		return "TripleDifferent [item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + "]";
	}
	
	
	
}
