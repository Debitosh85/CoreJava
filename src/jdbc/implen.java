package jdbc;

public interface implen {

    public abstract void m1(int x);

    public default void m2( int y) {
        System.out.println("This is m2 method");
        System.out.println("The value of y is " + y);

    }

}
