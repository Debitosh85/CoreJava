package multithreading;

class Join extends Thread{
@Override
public void run() {
  String name = Thread.currentThread().getName();
  for (int i = 1; i <= 10; i++) {
    System.out.println("I Value is " + i);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }
  System.out.println(name+"Thread is dead now");
}
}
public class JoinMain {
  public static void main(String[] args) {

    System.out.println("Main Thread Started..");
    String name = Thread.currentThread().getName();
    Join j1 = new Join();
    Join j2 = new Join();
    Join j3 = new Join();

    j1.setName("j1");
    j2.setName("j2");
    j3.setName("j3");

    j1.start();
    try {
      j1.join();
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
    j2.start();
    j3.start();
    System.out.println("Main Thread Wake up");
    for (int i = 1; i <= 10; i++) {
      System.out.println("I value for i is:" + i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
    }
    System.out.println(name+"Thread is dead now");
    
  }
}
