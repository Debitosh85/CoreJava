package polymorphism;


class Ambg {
  public void accept(long s, int l) {
    System.out.println("long - int");
  }

  public void accept(int y, long z) {
    System.out.println("int - long");
  }
}


public class Ambiguity {
public static void main(String[] args) {
  Ambg a = new Ambg();
  a.accept(9, 9);
  //ambiguity issue will Occured
}

}
