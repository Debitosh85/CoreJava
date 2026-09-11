package deb.functionalinterface;

public class MrefMain {

  public static void main(String[] args) {
    Mref r = MrefMain::add;
    int d = r.sum(10, 20);
    System.out.println("Sum is:"+d);
  }
  public static int add(int a, int b) {
    int c = a + b;
    return c;
}
}
