package test;

public class PersonMain {

  public static void main(String[] args) {
    
    

    Person p = new Student();
    p.walk();

    Person p1 = new Crickter();
    p1.walk();

    Student s = (Student) p;
    s.walk();

    Crickter c = (Crickter) p1;
    c.walk();
  }

}
