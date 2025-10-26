package multithreading;

public class DaemonMain {

  public static void main(String[] args) {
      
    DaemonThread d = new DaemonThread();
    d.setDaemon(true);
    d.start();

    System.out.println("End of Main Thread");



  }

}
