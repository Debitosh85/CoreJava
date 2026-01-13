package polymorphism;


interface Alpha {
  public void m1();
}

interface Beta {
  public void m1();
}

class Implementer implements Alpha, Beta {
  
  @Override
  public void m1() {
    System.out.println("Multiple inheritance is possible using Interface");
  }
}
public class MultipleInheritanceMain {

  public static void main(String[] args) {
    Implementer i = new Implementer();
    i.m1();
  }
}
