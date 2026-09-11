package inheritance;
class P {

  int age;
  String name;
  String address;

  public P(int age, String name, String address) {
    this.age = age;
    this.name = name;
    this.address = address;
  }

  public void details() {
    System.out.println("Age of Parent:" + age);
    System.out.println("name of P:" + name);
    System.out.println("address of P:"+address);
  }
  
}

class C extends P{
  
  String grade;
  String standard;
  int age;
  String name;
  String address;

  public C(int age, String name, String address, String grade, String standard) {
    super(age, name, address);
    this.grade = grade;
    this.standard = standard;
  }

  public void cDetails() {
    System.out.println("C grade:" + grade);
    System.out.println("C standard:"+standard);
  }
}
public class ParentM {
public static void main(String[] args) {
  C c = new C(5, "Balu", "AST", "A", "C");
  c.details();
  c.cDetails();
}
}
