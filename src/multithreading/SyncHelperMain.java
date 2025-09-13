package multithreading;

public class SyncHelperMain {

  public static void main(String[] args) {
    
    Sync s = new Sync();
    Sync s1 = new Sync();

    SyncHelper t = new SyncHelper(s, "Dhoni");
    SyncHelper t1 = new SyncHelper(s1, "yuvraj");

    t.start();
    t1.start();

    /* Here Programme will run irregularly and Synchronized Method also not work cause here  Different Threads working on different object */


  }

}
