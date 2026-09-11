package practice;

import java.util.*;
public class Condition {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number::");
    int num = sc.nextInt();

    /* if (num > 0) {
      System.out.println("Hello");
    } else {
      System.out.println("number is small..");
    } */

    String msg = (num > 0) ? "true": "false";
    System.out.println(msg);

    switch (num) {
    case 1 ->
      System.out.println("Monday");
      
    case 2 ->
        System.out.println("Tuesday");
      
    default ->
    System.out.println("Not valid");
    }
  }
}
