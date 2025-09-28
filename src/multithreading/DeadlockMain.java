package multithreading;

public class DeadlockMain  extends Thread{
  DeadlockA a = new DeadlockA();
  DeadlockB b = new DeadlockB();

  public void m1() {
    this.start();
    a.d1(b);
  }
  @Override
  public void run() {
    b.d2(a);
  }
  public static void main(String[] args) {
    DeadlockMain main = new DeadlockMain();
    main.m1();
  }

}
