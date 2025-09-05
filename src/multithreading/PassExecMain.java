package multithreading;

public class PassExecMain {

  public static void main(String[] args)throws InterruptedException{
    
    PassExec e = new PassExec();
    PassExec e1 = new PassExec();
    e.start();
    e1.start();
    
    

  }

}
