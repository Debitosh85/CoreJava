package deb.functionalinterface;

import java.util.Scanner;
import java.util.function.*;
public class VerifyName {

  public static void main(String[] args) {

    Predicate<String> p = str -> str.startsWith("A");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name to Check:");
    String name = sc.nextLine();
    System.out.println("The Name Starts with A:" + p.test(name));
    sc.close();
      
  }

}
