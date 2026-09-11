package deb.functionalinterface;

import java.util.function.*;
public class VerifyBiPredicate {

  public static void main(String[] args) {
      BiPredicate<String ,Integer> v = (x ,y) -> {
        return x.length() == y;
      };
      boolean result = v.test("Puri", 4);
      System.out.println(result);

      result = v.test("Hyderabad", 7);
      System.out.println(result);

      BiPredicate<Integer,Integer> t = (a,b) -> {
        return (a + b) % 2 == 0;
      };
      boolean evaluate = t.test(2, 3);
      System.out.println(evaluate);

      evaluate = t.test(4, 4);
      System.out.println(evaluate);

  }

}
