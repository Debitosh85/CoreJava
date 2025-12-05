package polymorphism;

class Vehicle {

  public int hP() {
    return 1200;
  }

  public void printHorsePower() {
    System.out.println(this.hP());
  }

}

class Car extends Vehicle {
  public int hp() {
    return 1400;
  }

  public void printHorsePower() {
    System.out.println(super.hP());
  }
}
public class HorsePower {
  public static void main(String[] args) {
    Vehicle v = new Car();
    v.printHorsePower();
  }
}
