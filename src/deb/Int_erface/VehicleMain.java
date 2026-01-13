package deb.Int_erface;

interface Vehicle {
  void run();

  void horn();

  default void digitalMeter() {
    System.out.println("Generic Meter");
  }
}

class Moped implements Vehicle {

  @Override
  public void run() {
    System.out.println("Moped is running");
  }

  @Override
  public void horn() {
    System.out.println("Mopeds horn 30 dcbl");
  }

  @Override
  public void digitalMeter() {
    System.out.println("Digital Meter added in Moped");
  }
}

class Truck implements Vehicle {
  
  @Override
  public void run() {
    System.out.println("Truck running with full Speed");
  }

  @Override
  public void horn() {
    System.out.println("Trucks Horn is 50 dcbl");
  }
}

public class VehicleMain {
  public static void main(String[] args) {
    Moped m = new Moped();
    m.run();
    m.horn();
    m.digitalMeter();

    Truck t = new Truck();
    t.run();
    t.horn();
    t.digitalMeter();
  }

}
