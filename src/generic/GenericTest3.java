package generic;

class Test<R, A> {
    private R r;

    public void set(A a) {
        r = (R) a;
    }

    public R get() {
        return r;
    }
}

public class GenericTest3 {
    public static void main(String[] args) {
        Test<String, String> test = new Test();
        test.set("Info");
        System.out.println(test.get());
    }
}
