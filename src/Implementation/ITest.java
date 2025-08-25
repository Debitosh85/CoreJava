package Implementation;

public interface ITest {

    public void m1(int y);

    public default void m2(int x) {

        System.out.println("We are now working with implementation ");

    }

}
