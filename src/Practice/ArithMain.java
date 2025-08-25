package Practice;

import java.util.Scanner;

public class ArithMain {

    public static void main(String[] args) {

        ArithTester m = new ArithTester();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your No::");
        int num = sc.nextInt();

        int result = ArithTester.checkValues(num);
        System.out.println(result);

        sc.close();
        
    }

}
