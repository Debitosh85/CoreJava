package polymorphism;

public class WrapperClass {
  public static void main(String[] args) {

    Integer i = new Integer(12);
    accept(i);
    System.out.println(i);
  }

  public static void accept(int y) {
      y = 22;
  }

}
