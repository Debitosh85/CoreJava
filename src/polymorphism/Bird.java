package polymorphism;

public class Bird {

  public void fly() {
    System.out.println("Generic Bird is Flying");
  }
}

class Parrot extends Bird {

  @Override
  public void fly() {
    System.out.println("Parrot is flying");
  }
}

class Sparrow extends Bird {
  @Override
  public void fly() {
    System.out.println("Sparrow is flying");
  }
}

class Peacock extends Bird {
  @Override
  public void fly() {
    System.out.println("Peacock is Flying");
  }
}
