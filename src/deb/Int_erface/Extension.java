package deb.Int_erface;

interface Alpha {
  public void m1();
}

interface Beta extends Alpha {
  public void m2();
}

class Gamma implements Beta {
  
  @Override
  public void m1() {
    System.out.println("Hii i am m1");
  }

  @Override
  public void m2() {
    System.out.println("Hii i am m2");
  }
}
public class Extension {
  public static void main(String[] args) {
 
    Gamma g = new Gamma();
    g.m1();
    g.m2();
  }
}
