package polymorphism;


class Super {
  public void print() {
    System.out.println("Hello");
  }
}

class Sub extends Super {
  
  @Override
   public void print() {
    System.out.println("Hii");

    //protected -> Wrong
    //Sub class Overridden Method Access Modifier is greater or equal 
    //As Compared to Super class Method Accessmodifier
  }

}

public class RoleAccessModifier {
  public static void main(String[] args) {
     Sub s = new Sub();
    s.print();
  }

}
