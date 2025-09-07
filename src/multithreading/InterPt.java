package multithreading;

public class InterPt extends Thread {

  public void run(){
    try{
      for(int i=0;i<=10;i++){
        System.out.println("i am a lazy Thread");
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
        System.out.println("I get interrupted");
      }
    }
  }
    

