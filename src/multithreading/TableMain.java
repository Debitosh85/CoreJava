package multithreading;

class Table {
  public synchronized void prinTable(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + "x" + i + "=" + (num * i));
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.getMessage();
      }
    }
    String name = Thread.currentThread().getName();
    System.out.println(name+"Thread ends its execution..");
  }
}
public class TableMain {
  public static void main(String[] args) {

    Table ta = new Table();
    Table tab = new Table();

    Thread t1 = new Thread(){
      @Override
      public void run(){
      ta.prinTable(5);
      }
    };

    Thread t2 = new Thread() {
      @Override
      public void run() {
        ta.prinTable(6);
      }
    };

    Thread t3 = new Thread(){
      @Override
      public void run(){
        tab.prinTable(7);
      }
    };

    Thread t4 = new Thread(){
      @Override
      public void run(){
        tab.prinTable(8);
      }
    };

    t1.setName("Child1");
    t2.setName("Child2");
    t3.setName("Child3");
    t4.setName("Child4");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }

}
