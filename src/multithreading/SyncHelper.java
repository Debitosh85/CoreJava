package multithreading;

public class SyncHelper extends Thread {

  Sync sync;
  String name;

  public SyncHelper(Sync sync,String name){
    this.sync = sync;
    this.name = name;
  }

  public void run() {
    sync.wish(name);
  }

}
