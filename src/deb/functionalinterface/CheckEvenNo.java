package deb.functionalinterface;

import java.util.Scanner;
import java.util.function.*;
public class CheckEvenNo {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the No want to check:");
      int no = sc.nextInt();

     /*  Predicate<Integer> p = new Predicate<Integer>() {
      public boolean test(Integer num) {
        return num % 2 == 0;
      }
     }; */
    
    Predicate<Integer> p = num-> num % 2==0;
    System.out.println("Is the Number Even:"+p.test(no));
  }
}
