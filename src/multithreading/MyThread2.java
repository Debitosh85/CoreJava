package multithreading;

public class MyThread2 extends Thread {

  Thread t1; //reference Variable

  public MyThread2(Thread t1) {

    this.t1 = t1;

  }
  
  public void run() {

    try {
      System.out.println("t2 Waiting for t1 to finish");
      t1.join();

    } catch (InterruptedException e) {
  
    }

    for (int i=0;i<=10;i++){
      System.out.println("MyThread2 is Running:"+i);
    }

  }

}
