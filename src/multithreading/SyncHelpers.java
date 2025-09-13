package multithreading;

public class SyncHelpers extends Thread {

  SyncBlock b;
  String name;

  public SyncHelpers(SyncBlock b, String name) {
    this.b = b;
    this.name = name;
  }
  
  @Override
  public void run() {
    b.wish(name);
  }

}
