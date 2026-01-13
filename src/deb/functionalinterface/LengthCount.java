package deb.functionalinterface;
@FunctionalInterface
interface Length {
  public void city(String str);
}
public class LengthCount {

  public static void main(String[] args) {
    Length l = str -> System.out.println("length of the String:" + str.length());
    l.city("India");
  }
}
