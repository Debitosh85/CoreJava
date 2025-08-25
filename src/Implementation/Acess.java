package Implementation;

public class Acess {

    public static ITest getRef() {

        ITest it = new ITest() {

            public void m1(int y) {
                System.out.println("now am inside implementation class");
            }
        };

        return it;
    }

}
