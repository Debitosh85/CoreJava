package polymorphism;
class Demo {
  public void input(Object... x) {
    for (Object y : x) {
      System.out.println("Values are"+y);
    }
  }
}
public class VarArgsDemos {

  public static void main(String[] args) {

    Demo d = new Demo();
    d.input(10);
    d.input(10, 20);
    d.input(20, 50, 50);
    d.input("India");
    d.input(3.9);
    d.input(true);
  }
}
