package multithreading;

public class ThreadA2Main {

  public static void main(String[] args) throws InterruptedException {
    ThreadA2 a = new ThreadA2();
    a.start();
    Thread.sleep(1000);// main Thread will wait for 10s
    System.out.println("main Thread trying to call wait method");
    synchronized (a) {
    a.wait(1000); // if time is not pass here it will wait forever
    }
    System.out.println("main thread get notification");
    System.out.println(a.total);
    
  }

}
