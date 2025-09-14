package multithreading;

public class ClevelLockHelper extends Thread {

  ClevelLock l;
  String name;

  public ClevelLockHelper(ClevelLock l, String name) {
    this.l = l;
    this.name = name;
  }

  public void run() {
    l.wish(name);
  }

}
