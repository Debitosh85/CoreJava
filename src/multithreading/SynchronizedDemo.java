package multithreading;

public class SynchronizedDemo {

  public static void main(String[] args) {
    
    Display d = new Display();
    DisplayHelper t = new DisplayHelper(d, "Dhoni");
    DisplayHelper t1 = new DisplayHelper(d, "Yuvraj");
    DisplayHelper t2 = new DisplayHelper(d, "raina");
    t.start();
    t1.start();
    t2.start();

  }

}
