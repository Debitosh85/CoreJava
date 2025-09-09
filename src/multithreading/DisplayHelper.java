package multithreading;

public class DisplayHelper extends Thread {

  Display d;
  String name;

  public DisplayHelper(Display d, String name) {
    this.d = d;
    this.name = name;
  }
  
  public void run() {
    d.wish(name);
  }
}
