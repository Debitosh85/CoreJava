package polymorphism;

abstract class Fruits {
  public abstract void sweet();

  public abstract void sour();
}

abstract class Guava extends Fruits {
  @Override
  public void sweet() {
    System.out.println("Guava is Sweet in Taste");
  }
}

class Mango extends Guava {
  @Override
  public void sour() {
    System.out.println("Mango Sour in Taste");
  }
}

public class FruitInventory {
  public static void main(String[] args) {
    Mango m = new Mango();
    m.sour();
    m.sweet();
  }

}
