package multithreading;

class Synco {

  public void displayn() {
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
  }

  public void displayc() {

    for (int i = 65; i <= 75; i++) {
      System.out.println((char) i);
    }

  }
}

class Sync extends Thread {
  Synco n;

  public Sync(Synco n) {
    this.n = n;
  }

  public void run() {

    n.displayn();
  }
}

class Syn extends Thread {
  
  Synco n;

  public Syn(Synco n) {

    this.n = n;
  }
  
  public void run() {
    n.displayc();
  }

}

public class SynchronizedDemo {

  public static void main(String[] args) {

    Synco s = new Synco();

    Sync s1 = new Sync(s);
    Syn s2 = new Syn(s);

    s1.start();
    s2.start();
    
  }

}
