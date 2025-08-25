package generic;

class NareshIT<R, A> {
	private R r;

	public void set(A a) {
		r = (R) a; // casting A to R
	}

	public R get() {
		return r;
	}
}

public class GenericTest4 {
	public static void main(String[] args) {

		NareshIT<String, String> test = new NareshIT();
		test.set("NareshIT");
		System.out.println(test.get());
	}
}