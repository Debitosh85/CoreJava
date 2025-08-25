package Practice;

public class Test11 {
    static int i = 0;
    int n = 0;

    public Test11() {
        Test11.i = i + 1;
        this.n = n + 1;
    }

    public void print() {
        System.out.println("Static variable i: " + Test11.i);
        System.out.println("Instance variable n: " + this.n);
    }

    public static void main(String[] args) {
        Test11 t1 = new Test11();
        t1.print();
        Test11 t2 = new Test11();
        t2.print();
        Test11 t3 = new Test11();
        t3.print();
    }
}
