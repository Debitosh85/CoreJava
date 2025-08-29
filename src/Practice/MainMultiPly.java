package practice;

class MultiPly {

    // public static void muliplication(int num) {

    // for (int i = 1; i <= 10; i++) {
    // System.out.println(num + "X" + i + "=" + (num * i));
    // }
    // }

    public static int multiplication(int num, int i) {
        return num * i;
    }

}

public class MainMultiPly {
    public static void main(String[] args) {

        int num = 5;

        for (int i = 1; i <= 10; i++) {

            int result = MultiPly.multiplication(num, i);

            System.out.println(num + "x" + i + "=" + result);

        }

    }
}
