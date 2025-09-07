package multithreading;

public class MainCallonChild extends Thread {

  static Thread mt;

  public void run() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("Child Thread");
    }
    try{
      mt.join();
    }catch(InterruptedException e){}
  }

}
