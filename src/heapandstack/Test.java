package heapandstack;

/* class Test {
    int x;
    int y;

    void m1(Test t) // t -> 2000x
    {
        x = x + 1;
        y = y + 2;
        t.x = t.x + 3;
        t.y = t.y + 4;
    }

    public static void main(String[] args) {
        Test t1 = new Test(); // x , y , m1()
        Test t2 = new Test(); // x , y , m1()

        t1.m1(t2);

        System.out.println(t1.x + "... " + t1.y);
        System.out.println(t2.x + "... " + t2.y);
    }

} */

/* public class Test {
    Test t;
    int val;

    public Test(int val) {
        this.val = val;
    }

    public Test(int val, Test t) {
        this.val = val;
        this.t = t;
    }

    public static void main(String[] args) {
        Test t1 = new Test(100);

        Test t2 = new Test(200, t1);

        Test t3 = new Test(300, t1);

        Test t4 = new Test(400, t2);

        t2.t = t3;
        t3.t = t4;
        t1.t = t2.t;
        t2.t = t4.t;

        System.out.println(t1.t.val);
        System.out.println(t2.t.val);
        System.out.println(t3.t.val);
        System.out.println(t4.t.val);
    }

} */

class Test {
    int x;
    int y;

    void m1(Test t) // t -> 2000x
    {
        x = x + 1;
        y = y + 2;
        t.x = t.x + 3;
        t.y = t.y + 4;
    }

    public static void main(String[] args) {
        Test t1 = new Test(); // x , y , m1()
        Test t2 = new Test(); // x , y , m1()

        t1.m1(t2);

        System.out.println(t1.x + "... " + t1.y);
        System.out.println(t2.x + "... " + t2.y);

        t2.m1(t1);
        System.out.println(t1.x + "... " + t1.y);
        System.out.println(t2.x + "... " + t2.y);

        t1.m1(t1);
        System.out.println(t1.x + "... " + t1.y);
        System.out.println(t2.x + "... " + t2.y);

        t2.m1(t2);
        System.out.println(t1.x + "... " + t1.y);
        System.out.println(t2.x + "... " + t2.y);
    }
}