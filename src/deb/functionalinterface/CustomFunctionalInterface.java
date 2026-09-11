package deb.functionalinterface;

public class CustomFunctionalInterface {
  public static void main(String[] args) {
    TriFunction<Integer, Integer, Integer, String> t = (a, b, c) -> "" + a + b + c;
    System.out.println(t.myApply(10, 20, 30));
  }
}
