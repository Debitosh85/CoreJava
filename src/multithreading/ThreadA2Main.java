package multithreading;

public class ThreadA2Main {

  public static void main(String[] args) throws InterruptedException {

    ThreadA2 a = new ThreadA2();

    a.start();

    System.out.println("main Thread trying to call wait method");

    synchronized (a) {
    a.wait();
    }
    System.out.println("main thread get notification");
    System.out.println(a.total);
    
  }

}
