package polymorphism;
class Var {
  public void accept(int x, int... y) {
    System.out.println("Value of x:" + x);
    for (int z : y) {
      System.out.println("Value of y are:"+z);
    }
  }
}
public class VarargssDemo4 {
  public static void main(String[] args) {
    Var v = new Var();
    v.accept(12, 10, 20, 30, 40, 50);
  }

}
