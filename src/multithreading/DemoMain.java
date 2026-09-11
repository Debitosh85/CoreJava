package multithreading;

class Demos implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread is running..");
  }
}
public class DemoMain {
  public static void main(String[] args) {
    Demos s = new Demos();
    Thread t = new Thread(s);
    t.start();
  }
}
