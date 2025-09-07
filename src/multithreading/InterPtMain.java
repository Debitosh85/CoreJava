package multithreading;

public class InterPtMain {
  public static void main(String[] args) {

    InterPt t = new InterPt();
    t.start();
    //t.interrupt();

    for (int i = 0; i <= 10; i++) {
      System.out.println(" End of main thread");
    }
    
  }

}
