package multithreading;

public class MainChild {

  public static void main(String[] args) {
    
    MainCallonChild.mt = Thread.currentThread();

    MainCallonChild m = new MainCallonChild();
    m.start();

    for (int i = 0; i <= 10; i++) {
      System.out.println("Main Theread");
    }

 
  }

}
