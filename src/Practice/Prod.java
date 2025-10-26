package practice;

public class Prod {

  private String name;
  private double price;
  private String model;

  public Prod(String name, double price, String model) {
    this.name = name;
    this.price = price;
    this.model = model;
  }

  public static Prod getProductObject() {
    return new Prod("Dell Laptop", 20000.0, "Inspiron 15");
  }

  @Override
  public String toString() {
    return"[name="+name+",product="+price+",model="+model+"]";
  }

}
