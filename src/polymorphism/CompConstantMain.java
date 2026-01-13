package polymorphism;


class CompConst {
  static {
    System.out.println("Hello Good Morning");
  }
  public static final int x = 100;
}

public class CompConstantMain {
  public static void main(String[] args) {
      System.out.println(CompConst.x);
  }

}
