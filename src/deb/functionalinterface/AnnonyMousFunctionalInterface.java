package deb.functionalinterface;

public class AnnonyMousFunctionalInterface {
  public static void main(String[] args) {
    Accept a = new Accept()
    {
      @Override
      public void sum(){
        System.out.println("Sum is :"+3);
      }
    };

    Accept b = new Accept(){
      @Override
      public void sum(){
        System.out.println("Sum is :"+(3+2));
      }
    };

    a.sum();
    b.sum();
  }
}
