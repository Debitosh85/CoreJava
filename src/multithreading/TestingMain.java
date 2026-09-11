package multithreading;

class Testing {

  public void runs() {
    System.out.println("hello");
  }
}

public class TestingMain {
  public static void main(String[] args) {
      
    Testing t1 = new Testing();
    Testing t2 = new Testing();

    Runnable r1 = () -> {
      t1.runs();
    };

    Thread t = new Thread(r1, "Debitosh");
    t.start();
    

    



  }

}
