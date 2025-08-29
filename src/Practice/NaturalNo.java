package practice;

import java.util.*;

public class NaturalNo {

    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of 100 natural no is:" + sum);
        sc.close();

    }

}
