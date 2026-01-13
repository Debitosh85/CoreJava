package polymorphism;

class Tea implements HotDrink {

  @Override
  public void prepare() {
    System.out.println("Preparing Tea");
  }
}

class Cofee implements HotDrink {
  @Override
  public void prepare() {
    System.out.println("Cofee Preparing");
  }
}

class BadamShake implements HotDrink {
  @Override
  public void prepare() {
    System.out.println("BadamShake Preparing");
  }
}

class Horlicks implements HotDrink {
  @Override
  public void prepare() {
    System.out.println("Horlicks Preparing");
  }
}

class Restaurant {
  public static void acceptOrder(HotDrink hd){
    hd.prepare();
  }
}

public class RestaurantService {
  public static void main(String[] args) {
      
    Restaurant r = new Restaurant();
    r.acceptOrder(new Tea());
    System.out.println("================");
    r.acceptOrder(new Cofee());
    System.out.println("===============");
    r.acceptOrder(new BadamShake());
    System.out.println("=================");
    r.acceptOrder(new Horlicks());

  }
}
