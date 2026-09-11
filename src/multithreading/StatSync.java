package multithreading;

class Stat {
  public synchronized static void print(int n){
    for(int i=1;i<=10;i++){
      try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          System.out.println(e.getMessage());
        }
      System.out.println(n+"x"+i+"="+(n*i));
  }
    } 
}

public class StatSync {
  public static void main(String[] args) {
      
    Thread t1 = new Thread(){
      @Override
      public void run(){
        Stat.print(10);
      }
    };

    Thread t2 = new Thread(){
      @Override
      public void run(){
        Stat.print(15);
      }
    };

    Runnable r3 = () -> Stat.print(5);
    Thread t3 = new Thread(r3);
    t1.start();
    t2.start();
    t3.start();
  }

}
