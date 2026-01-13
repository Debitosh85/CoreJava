package deb.functionalinterface;
import java.util.*;
@FunctionalInterface
interface Check {
  boolean number(int num);
}
public class CheckEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to verify:");
    int no = sc.nextInt();
    Check c = num ->
    {
      return num % 2 == 0;
    };
    System.out.println("Is" + no + "evenNO:" + c.number(no));
    sc.close();
  }
}
