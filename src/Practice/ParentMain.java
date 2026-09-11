package practice;

/* class Parent {

  public void calculateAge() {
    System.out.println(10 + 10 + "is your age");
  }
} */

class Child extends Thread {

  /* @Override
  public void calculateAge() {
    System.out.println("After updation:"+(10+23));
  } */

  @Override
  public void run() {
    System.out.println("Hello");
  }
}

public class ParentMain {
  
  public static void main(String[] args) {
    
    Child c = new Child();
    c.start();
    //c.calculateAge();
  }
}
