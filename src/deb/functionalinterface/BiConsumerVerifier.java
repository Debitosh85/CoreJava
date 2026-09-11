package deb.functionalinterface;

import java.util.function.*;
public class BiConsumerVerifier {

  public static void main(String[] args) {
      
    BiConsumer<Integer,String >  updateValues = (num, str) -> {

      num = num * 2;
      str = str.toUpperCase();
      System.out.println("Updated values are:"+num+""+str);
    };

    int num = 15;
    String str = "hyderabad";
    updateValues.accept(num, str);
    System.out.println("Original Values:"+num+""+str);
  }

}
