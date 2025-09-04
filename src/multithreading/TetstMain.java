package multithreading;

public class TetstMain {
  public static void main(String[] args) {

    Test t = new Test();
    t.start();
    
    System.out.println(t.getName());

    for (int i = 0; i <= 10; i++) {
     System.out.println(Thread.currentThread().getName());
    }
    
  }

}
