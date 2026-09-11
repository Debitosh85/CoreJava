package multithreading;

class Alpha extends Thread {
  
  @Override
  public void run() {
    
    Thread t = Thread.currentThread();
    String name = t.getName();

    Beta b = new Beta();
    b.setName("Beta");
    b.start();
    /* try {
      //b.join();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    } */
    for (int i = 1; i <= 10; i++) {
      System.out.println("I value by:"+name+i);
    }
  }
}
public class FlipJoin {
  public static void main(String[] args) {

    Alpha a = new Alpha();
    a.setName("Alpha");
    a.start();
  }
}
class Beta extends Thread {
  
  @Override
  public void run() {
    Thread t = Thread.currentThread();
    String name = t.getName();

    for (int i = 1; i <= 20; i++) {
      System.out.println("I Value by" + name + i);
      /* try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      } */
    }
    System.out.println(name+"Thread is dead Now...");
  }
}
