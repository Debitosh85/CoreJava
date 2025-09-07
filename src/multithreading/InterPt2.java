package multithreading;

public class InterPt2 extends Thread {

  public void run() {
    for (int i = 0; i <= 100; i++) {
      System.out.println("i am a lazy Thread" + i);
    }
    System.out.println("i want to Sleep");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("I get Interrupted");
    }
  }

}

/* in the above example Interrupt call wait untill child Thread Complete for loop 100 times   */
