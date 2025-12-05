package polymorphism;

public class BirdMain {
public static void main(String[] args) {
  Bird b = null;
  b = new Parrot();
  b.fly();
  b = new Sparrow();    //Dynamic Method Dispatch
  b.fly();
  b = new Peacock();
  b.fly();
}
}
