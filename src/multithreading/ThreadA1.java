package multithreading;

public class ThreadA1 {

  public static void main(String[] args) {
    
    ThreadB b = new ThreadB();
    b.start();
    System.out.println(b.total);
    
  }

}
