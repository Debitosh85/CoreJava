package generic;

class Test<R, A> {
    private R r;
    private A a;

    public void set(A a, R r) // method
    {
        this.a = a;
        this.r = r;
    }

    public String get() {
        String str = a.toString() + r.toString();
        return str;
    }
}

public class Generic5 {
    public static void main(String[] args) {

        Test<String, String> test = new Test<>();
        test.set("Naresh I ", "Technologies");
        System.out.println(test.get());
    }
}