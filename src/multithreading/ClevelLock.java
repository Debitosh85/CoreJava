package multithreading;

public class ClevelLock {

  public void wish(String name) {
    synchronized(ClevelLock.class){   //class level lock applied here
      for(int i=0;i<=10;i++){  
        System.out.print("Good Morning:");
        try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
          }
        System.out.println(name);
      }
    }
  }

}
