package practice;

import java.util.Scanner;
import java.util.function.Function;

public class Functionall {

    public static void main(String[] args) {

        Function<String, Integer> fn = new Function<String, Integer>() {
            @Override
            public Integer apply(String str) {
                return str.length();
            }
        };

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int length = fn.apply(name);
        System.out.println("Length of the String is: " + length);
        sc.close();
    }
}
