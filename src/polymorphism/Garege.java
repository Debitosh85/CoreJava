package polymorphism;

abstract class Bikes {
  protected int speed = 100;

  public abstract void run();

  public void feature() {
    System.out.println("Generic Features");
  }
}

class Ktm extends Bikes {
  @Override
  public void run() {
    System.out.println("Ktm Have jet engine like thrust");
  }

  @Override
  public void feature() {
    System.out.println("One of the best feature in Ktm that is Double Silencer");
  }
}

class Hayabusa extends Bikes {
  
  @Override
  public void run() {
    System.out.println("Hayabusa's top Speed Mach2");
  }

  @Override 
  public void feature() {
    System.out.println("Hayabusa's Top feature is it reflects one light During burn out'");
  }

}

public class Garege {
  public static void main(String[] args) {
    Bikes b = null;
    b = new Ktm();
    System.out.println("Speed of the ktm is:" + b.speed);
    b.run();
    b.feature();

    System.out.println("===============");

    b = new Hayabusa();
    b.feature();
    b.run();
  }

}
