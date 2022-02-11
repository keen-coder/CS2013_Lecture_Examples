package class_examples;

public class BoundedTypeClass<T extends Number> {
	private T value;

	public BoundedTypeClass(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BoundedTypeClass [value=" + value + "]";
	}
	
	
}
