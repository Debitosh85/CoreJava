package polymorphism;

class Parent {

  public Object accept() {
    System.out.println("Parent");
    return this;
  }
}
class Child extends Parent {

  @Override
  public System accept() {
    System.out.println("Child");
    return null;
  }
}
public class Covariant2 {
  public static void main(String[] args) {
    Child c = new Child();
    c.accept();
  }
}
