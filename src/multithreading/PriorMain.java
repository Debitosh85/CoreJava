package multithreading;

public class PriorMain {

  public static void main(String[] args) {

    Prior p = new Prior();
    p.setPriority(10);
    p.start();

    //System.out.println(Thread.currentThread().getPriority());

    for (int i = 0; i <= 10; i++) {
      System.out.println("Main Thread");
    }
    
  }

}
