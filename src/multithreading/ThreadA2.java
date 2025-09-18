package multithreading;

public class ThreadA2  extends Thread {
  int total = 0;

public void run() {
    
synchronized (this) {
    System.out.println("child thread start calculation");
    
    for (int i = 1; i <= 100; i++)
    {
    total = total +i;
    }
    this.notify();
    System.out.println("Child Thread will notify main to complete execution");
  }
  }

}
