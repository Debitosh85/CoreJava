package practice;

class Test14 {

  static int value = 5;

  public int accept(int x) {
    System.out.println(x);
    return Test14.value;
  }
}

public class StaticDemos {
  public static void main(String[] args) {
    
    /* static belongs to class & Can be accessed using Object reference
       but when it comes to reference we cant access static as a raw statement 
       we must print or assign or Use inside any expression or return or pass as an argument ..
    */

    Test14 t = new Test14();
    t.value = 60; 
    System.out.println(t.value);
    int x = t.value + 5;
    System.out.println(x);
    t.accept(Test14.value);
  }

}
