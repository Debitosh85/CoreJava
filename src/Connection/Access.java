package Connection;

public class Access {

    public static Itest getref() {
        Itest ob = new Itest() {
            @Override
            public void m1(int x) {

                System.out.println("The value of x is " + x);

            }

        };
        return ob;

    }

}
