package Exam;

class Refer1 {

    int a = 20;

    int c = modify(a);

    public static int modify(int y) {
        y = 30;

        return y;
    }

}

public class Refer {
    public static void main(String[] args) {
        Refer1 r = new Refer1();
        System.out.println("The Value of c is" + r.c);

    }
}
