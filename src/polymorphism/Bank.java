package polymorphism;

class Sbi {

  public String ifscCode = "SBI9087464";

  public void loan() {
    System.out.println("sbi will provide loan based on document");
  }

}

 class Rbi extends Sbi {
  
  public String ifscCode = "RBI4647474";

  @Override
  public void loan() {
    System.out.println("Rbi giving loan based on 9.2%");
  }
}

public class Bank {

  public static void main(String[] args) {
    Sbi s = new Rbi();
    System.out.println(s.ifscCode);
    s.loan();
  }

}
