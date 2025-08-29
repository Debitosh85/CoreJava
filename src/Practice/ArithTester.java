package practice;

public class ArithTester {

    public static int checkValues(int num) {

        if (num == -1) {
            return -1;


        } else if (num % 2 == 0) {
            int val =  num * num;

            return val;

        } else  {

            int val2 =  num * num * num;

            return val2;
        }
    }

}
