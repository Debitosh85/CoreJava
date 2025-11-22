package multithreading;
class Game{
  public void playGame() {
    for (int i = 0; i <= 10; i++) {
      System.out.println("value of i is:"+i);
  }
}
}

public class ThredUsinglambda {
  public static void main(String[] args) {
      
    Game g = new Game();
    Thread t1 = new Thread(()->{
      g.playGame();
    });
    t1.start();


    }
  }
  

