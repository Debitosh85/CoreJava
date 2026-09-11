package multithreading;

public class AnThredwrefMain {
  public static void main(String[] args) {
    new Thread(){
      @Override
      public void run(){
        String name = Thread.currentThread().getName();
        System.out.println("Annonymous Thread is:"+name);

        for(int i=1;i<=10;i++){
          System.out.println(name+"Thread is running.."+i);
          try {
              Thread.sleep(-1000);
          } catch (InterruptedException |IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }
        }
      }
    }.start();
    String name = Thread.currentThread().getName();
    System.out.println("Tasks are running inside Thread:"+name);
  }
}
