package polymorphism;

abstract class GeoComponent {

  protected static int value;

  public GeoComponent(int value) {
    super();
    this.value = value;
  }

}

class Polygon extends GeoComponent {

  public Polygon(int value) {
    super(value);
  }

  public void GeoName() {
    System.out.println("i am polygon"+value);
  }
}

class Rohmbous extends GeoComponent {
  
  public Rohmbous(int value) {
    super(value);
  }

  public void GeoName() {
    System.out.println("i am Rohmbous"+value);
  }

}

public class GeoMetry {
  public static void main(String[] args) {
    Polygon g = new Polygon(10);
    g.GeoName();
    Rohmbous r = new Rohmbous(20);
    r.GeoName();
    GeoComponent c = new Polygon(30);
    GeoComponent.value = 50;
    System.out.println(GeoComponent.value);

  }
}
