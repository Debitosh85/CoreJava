package deb.functionalinterface;

import java.util.*;
import java.util.function.*;
public class FunctionVerifier {

  public static void main(String[] args) {
    Function<Integer, Integer> n = num -> num * num * num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number to verify:");
    int no = sc.nextInt();
    Integer result = n.apply(no);
    System.out.println("Cube of the " + no + "is:" + result);
    sc.nextLine();

    Function<String, Integer> s = str -> str.length();
    System.out.println("Enter the Name of the City to Verify the Length:");
    String city = sc.nextLine();
    
    Integer length = s.apply(city);
    System.out.println("The Length of the City is:" + length);
  
    Function<String, Boolean> f = str -> str.startsWith("A");
    System.out.println("Enter the Name to Verify Start with A o not:");
    String name = sc.nextLine();
    System.out.println("The Name Start with A:" + f.apply(name));
    sc.close();
  }
}
