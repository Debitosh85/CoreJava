package multithreading;

public class MythreadMain {

  public static void main(String[] args) {

    Mythread1 t1 = new Mythread1();
    MyThread2 t2 = new MyThread2(t1);

    t1.start();
    t2.start();
    
  }

}
