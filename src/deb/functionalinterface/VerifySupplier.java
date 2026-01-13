package deb.functionalinterface;

import java.util.function.*;
public class VerifySupplier {

  public static void main(String[] args) {

    Supplier<String> s = () -> 100 + 200 + "NIT" + 80 + 80;
    System.out.println(s.get());
  }

}
