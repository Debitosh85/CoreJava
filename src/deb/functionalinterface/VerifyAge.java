package deb.functionalinterface;

import java.util.*;
import java.util.function.*;

public class VerifyAge {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Predicate<Integer> p = age -> age >= 18;
    System.out.println("Enter Your age to check the elgibility:");
    int age = sc.nextInt();
    boolean result = p.test(age);
    /* if (!result) {
        System.out.println("You are not eligible to Vote");
      } else {
      System.out.println("you are eligible to vote");
    } */

    if (result) {
      System.out.println("Eligible to Vote");
    } else {
      System.out.println("You are not eligible to vote");
    }
  }
}
