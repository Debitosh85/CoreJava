package multithreading;

public class InterPt2Main {

  public static void main(String[] args) {
    
    InterPt2 t = new InterPt2();
    t.start();
    t.interrupt();

    for (int i = 0; i <= 10; i++) {
      System.out.println("End of Main Thread");
    }

  }

}
