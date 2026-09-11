package deb.Int_erface;

class Infc implements IntfcFrom9 {

  @Override
  public void m1() {
    System.out.println("Infc m1 Method");
  }
}

public class InfcFromNineVerifier {
  public static void main(String[] args) {
    IntfcFrom9 i = new Infc();
    i.m1();
    i.m2();
    IntfcFrom9.m3();
  }
}
