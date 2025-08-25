package Logics;

import java.util.*;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int sum;

        System.out.println("Enter the no of terms:");
        int term = sc.nextInt();

        System.out.println(first + " " + second);

        for (int i = 0; i <= term; i++) {

            sum = first + second;
            System.out.println("" + sum);
            first = second;
            second = sum;

        }
        sc.close();

    }

}
