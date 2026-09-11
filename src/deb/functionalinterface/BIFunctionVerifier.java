package deb.functionalinterface;

import java.util.function.*;
public class BIFunctionVerifier {

  public static void main(String[] args) {

    //BiFunction<T,U,R> = () -> T + U -> input & Return Decided By user 
    BiFunction<String, String, String> concatenet = (a, b) -> a + b ;
    System.out.println(concatenet.apply("Hello", "Debitosh"));
    
    BiFunction<String,String,Integer> concatenetLength = (str1,str2) -> str1.length() + str2.length();
    Integer result = concatenetLength .apply("Debitosh", "Mohanty");
    System.out.println("Result is :"+result);
  }

}
