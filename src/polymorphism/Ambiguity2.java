package polymorphism;

class AmObj {
  
  public void accept(Object x) {
    System.out.println("Object");
  }

  public void accept(String x) {
    System.out.println("String");
  }
}
public class Ambiguity2 {
public static void main(String[] args) {
  AmObj a = new AmObj();
  a.accept(9);
}
}
