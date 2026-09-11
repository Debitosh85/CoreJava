package deb.Int_erface;

class Printable implements Print {

  @Override
  public String toString() {
    return "Printable[]";
  }
}

public class PrintableMain {
  public static void main(String[] args) {

    Print p = new Printable();
    System.out.println(p.hashCode());
    System.out.println(p.toString());

  }
}


