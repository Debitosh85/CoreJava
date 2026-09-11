package deb.functionalinterface;

import java.util.function.*;

public class UnaryOpVerifier {

  public static void main(String[] args) {

    UnaryOperator<Integer> i = (num) -> num * num;
    int result = i .apply(5);
    System.out.println("Value of result is :" + result);
    
    UnaryOperator<String> concat = (str) -> str.concat("Base");
    System.out.println("After Concatenation:" + concat.apply("Data"));

    BinaryOperator<Integer> s = (a, b) -> a + b;
    int sum = s.apply(5, 5);
    System.out.println("Total Sum of 2 No is:" + sum);
  }

}
