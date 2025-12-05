package polymorphism;
/* class TestDemo {
}

public class Instance {
  
  public static void main(String[] args) {
    TestDemo t1 = new TestDemo();
    if (t1 instanceof TestDemo) {
      System.out.println("t1 is test Object");
    }
  }

}
 */

class Lambda {
  
}

class Theta extends Lambda {
  
}

class Phie  extends Theta{
  
}

class Instance {
  public static void main(String[] args) {
    Phie p = new Phie();
      
    if (p instanceof Phie) {
      System.out.println("p is Phie Object");
    }
    if (p instanceof Theta) {
      System.out.println("p pointing to Theta Object");
    }
    if (p instanceof Lambda) {
      System.out.println("p pointing to lambda");
    }
    if (p instanceof Object) {
      System.out.println("p Pointing to Object");
    }
  }
}