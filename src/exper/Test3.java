package exper;

public class Test3 {
    public static void main(String[] args) {

        int num = 5;
        int temp = num;
        int originalnum = num;
        for (int i = 1; i <= num; i++) {

            temp *= (--num);

        }

        System.out.println("Factorial of:" + originalnum + "is" + temp);

    }
}
