package polymorphism;

class Alpha {

  public Alpha accept() {
    System.out.println("Super Class Method");
    return new Alpha();
  }
}

class Beta extends Alpha {
  @Override
  public Beta accept() {
    System.out.println("Sub class Method");
    return new Beta();
  }
}

public class Covariant {

  public static void main(String[] args) {

    Alpha a = new Beta();
    a.accept();
      
  }

}
