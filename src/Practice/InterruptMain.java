package practice;

class Inter extends Thread {
  @Override
  public void run() {
    String name = Thread.currentThread().getName();
    for (int i = 1; i <= 10; i++) {
      System.out.println(name + " Thread is running count is::" + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.getMessage();
      }
      System.out.println(name+"Completed its task...");
    }
  }
}
public class InterruptMain {
  public static void main(String[] args)throws InterruptedException {
   
    String name = Thread.currentThread().getName();
    System.out.println(name + "Thread Started..");
    
    Inter i1 = new Inter();
    Inter i2 = new Inter();
    Inter i3 = new Inter();

    i1.setName("I1");
    i2.setName("I2");
    i3.setName("I3");

    i1.start();
    i1.join();
    System.out.println("Main Thread wakeup..");
    i2.start();
    i3.start();
    System.out.println("Main Thread ended...");
  }
}
