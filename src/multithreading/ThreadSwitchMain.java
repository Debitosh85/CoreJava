package multithreading;

class Child extends Thread {

  public void run() {

    String name = Thread.currentThread().getName();

    for (int i = 0; i <= 10; i++) {
      System.out.println("Thread Running" + name + "=" + i + "times");
    }
  }
}

public class ThreadSwitchMain {
  public static void main(String[] args) {

    Child c = new Child();
    c.start();
    String name = Thread.currentThread().getName();

    for (int i = 1; i <= 10; i++) {
      System.out.println("Thread running"+name+"="+i+"times");
    }
    int x = 1;
    do { 
      System.out.println("india by:"+name);
      x++;
    } while (x<=10);
  }
}
