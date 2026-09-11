package Exceptionhandling;
import java.lang.*;

public class Test {
  public static void main(String[] args) {
    try {
      System.out.println("Outer try block");
        try {
          System.out.println("inner try block");
          System.out.println(10/0);
          } catch (ArithmeticException e) {
            System.out.println("Number can't be devided with 0");
        }
      } catch (Exception e) {
        System.out.println("Outer catch block");
      }
      finally {
        System.out.println("Outer finally block ");
      }
  }
}
