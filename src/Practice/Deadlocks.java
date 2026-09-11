package practice;

public class Deadlocks {

  public static void main(String[] args) throws InterruptedException {
   /*  Thread t = Thread.currentThread();
   System.out.println(t.getName());
   
   for (int i = 0; i <= 10; i++) {
     System.out.println(i);
   }
   t.join(); //Dead 
   System.out.println("Main Thread ended"); */ 
   Runnable t = new Runnable(){
    @Override
     public void run() { 
       String name = Thread.currentThread().getName();
       System.out.println(name);
  }
   };

   Thread t1 = new Thread(t);
   t1.start();


  }
}
