package deb.functionalinterface;

import java.util.*;
import java.util.function.*;
public class NameVerifier {

  public static void main(String[] args) {
      
    Predicate<String> p = str -> str.equalsIgnoreCase("Ravi");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name to Verify:");
    String name = sc.nextLine();
    
    System.out.println("The name is Matched:"+p.test(name));
  }
}
