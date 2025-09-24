package multithreading;

public class DeadlockA {

  public synchronized void d1(DeadlockB b){

    System.out.println("Thread T1 Started executing d1() method");

    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    b.last();
    System.out.println("d1 method executed");
  }

  public synchronized void last() {
    System.out.println("inside a  B wants to execute a's last() Method'");
  }


}
