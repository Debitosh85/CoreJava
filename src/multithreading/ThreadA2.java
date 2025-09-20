package multithreading;

public class ThreadA2  extends Thread {
  int total = 0;

@Override
public void run() {
synchronized (this) {
    System.out.println("child thread start calculation");
    for (int i = 1; i < 100; i++) {
      total = total + i;
    }
    this.notify();
    System.out.println("Child Thread will notify main to complete execution");
  }          // After Sleep() of main Child Will finish its execution and notify onetime and goes to Dead State later this the Wait method will forever .cause after this there is no other threads which will notify to waiting Thread..
  }
}
