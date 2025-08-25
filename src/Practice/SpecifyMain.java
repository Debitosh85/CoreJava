package Practice;

class Specify {

    static int a;
    int b;

    public void getNumber(int c) {
        int d = 300;

        System.out.println("Class Variable is :" + a);
        System.out.println("instance Variable b:" + b);
        System.out.println("ParaMeter Variable:" + c);
        System.out.println("Local Variable :" + d);
    }
}

public class SpecifyMain {
    public static void main(String[] args) {

        Specify s1 = new Specify();
        s1.getNumber(400);

    }

}