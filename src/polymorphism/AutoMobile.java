package polymorphism;

abstract class TwoWheeler {

  public abstract void run();

  public void mileage() {
    System.out.println("Generic Vehicle Mileage");
  }
}

class Hero extends TwoWheeler {
  
  @Override
  public void run() {
    System.out.println("Hero Recently invented Battery Engine");
  }

  @Override
  public void mileage() {
    System.out.println("Battery Vehicle Showing 100 mileage");
  }

}

class Yamaha extends TwoWheeler {
  
  @Override
  public void run() {
    System.out.println("Yamaha known for its Speed & Thrilling Experience");
  }
}
public class AutoMobile {
public static void main(String[] args) {
  TwoWheeler t = null;
  t = new Hero();
  t.run();
  t.mileage();

  System.out.println("==================");

  t = new Yamaha();
  t.run();
  t.mileage();
}
}
