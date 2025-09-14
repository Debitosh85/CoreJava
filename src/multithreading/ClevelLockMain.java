package multithreading;

public class ClevelLockMain {

  public static void main(String[] args) {

    ClevelLock l = new ClevelLock();

    ClevelLockHelper l1 = new ClevelLockHelper(l, "Debitosh");
    l1.start();
    
  }

}
