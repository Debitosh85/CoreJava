package Connection;

public interface Itest {

    public abstract void m1(int x);

    public default void m2(int y) {
        System.out.println("***The value of x is ");
        System.out.println("The value of y is " + y);
    }

}
