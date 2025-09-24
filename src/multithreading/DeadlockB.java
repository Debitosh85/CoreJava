package multithreading;;

public class DeadlockB {

  public  synchronized  void d2(DeadlockA a){
    System.out.println("Thread T2 Started execcution of d2 method");

    try {
        Thread.sleep(5000);
    } catch (InterruptedException  e) {
      e.printStackTrace();
    }
    a.last();
    System.out.println("d2 method executed");
  }

  public synchronized void last() {
    System.out.println("inside b A wants to access b's last()' method");
  }

}
