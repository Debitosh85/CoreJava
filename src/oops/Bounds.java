
class Bound {
  int id;
  String name;
  String address;
  long phoneno;

  public Bound(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Bound=[id=" + id + "name=" + name + "address=" + address + "phoneno=" + phoneno + "]";
  }
}

public class Bounds {
  
  public static void main(String[] args) {
    Bound b = new Bound(1, "ex");
    System.out.println(b.id);
    System.out.println(b.name);
    System.out.println(b.address);
    System.out.println(b.phoneno);
    System.out.println(b);
  }

}
