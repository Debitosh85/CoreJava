package generic;

class NareshIT<T> {
	private T test;

	public void set(T test) {
		this.test = test;
	}

	public T get() {
		return test;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		NareshIT<Integer> nit = new NareshIT<>();
		nit.set(10);
		System.out.println(nit.get());
	}
}
