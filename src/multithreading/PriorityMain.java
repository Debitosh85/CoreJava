package multithreading;

class Priority extends Thread {

  @Override
  public void run() {
    int count =0;
    for (int i = 1; i <= 100000; i++) {
      count++;
    }
    int priority = Thread.currentThread().getPriority();
    String name = Thread.currentThread().getName();

    System.out.println("Count Value:"+count);
    System.out.println("Priority of the thread:"+priority+"name of the thread is:"+name);
  }
}

public class PriorityMain {
  public static void main(String[] args) {
      
    Priority p = new Priority();
    Priority p1 = new Priority();

    p.setPriority(Thread.MIN_PRIORITY);
    p1.setPriority(Thread.MAX_PRIORITY);

    p.setName("Last");
    p1.setName("First");

    p.start();
    p1.start();
  }
}
