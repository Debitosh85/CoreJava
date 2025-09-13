package multithreading;

public class SyncBloMain {

  public static void main(String[] args) {
    
    SyncBlock b = new SyncBlock();
    SyncHelpers h = new SyncHelpers(b, "Debitosh");
    SyncHelpers h1 = new SyncHelpers(b, "Dhoni");
    h.start();
    h1.start();

  }

}
