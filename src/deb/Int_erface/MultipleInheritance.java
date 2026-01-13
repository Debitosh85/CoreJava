package deb.Int_erface;
interface Phie {

  default void m1() {
    System.out.println("Hii i am m1");
  }
}

interface Ohm {

  default void m2() {
    System.out.println("Hii i am m2");
  }
}

class MathSign implements Phie,Ohm {
  
  @Override
  public void m1() {
    Phie.super.m1();
    Ohm.super.m2();
    System.out.println("i am a Clone of M1");
  }
}

public class MultipleInheritance {
  public static void main(String[] args) {
      
    MathSign s = new MathSign();
    s.m1();
  }

}
