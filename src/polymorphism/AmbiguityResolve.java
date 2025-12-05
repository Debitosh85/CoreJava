package polymorphism;

class AmbiguityDemo {
  /* public void accept(double x) {
    System.out.println("Value of x is :" + x);
  }
  
  public void accept(float y) {
    System.out.println("Value of y:"+y);
  } */

  /* public void accept(int x) {
    System.out.println("Value of x:" + x);
  }
  
  public void accept(char y) {
    System.out.println("Value of y:"+y);
  } */
 
  /* public void accept(int... x) {
    System.out.println("Int");
  }
  
  public void accept(char... x) {
    System.out.println("Char");
  } */
 
  public void accept(byte... x) {
    System.out.println("Value of x:" + x);
  }

  public void accept(short... x) {
    System.out.println("Value of x:"+x);
  }
}


public class AmbiguityResolve {
public static void main(String[] args) {
  
  AmbiguityDemo d = new AmbiguityDemo();
  //d.accept(15);
  d.accept((byte) (15));
  d.accept((short) (16));


}

}
