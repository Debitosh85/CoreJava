package multithreading;

class Alphas extends Thread{

    @Override
    public void run(){

        Thread t = Thread.currentThread();
        String name = t.getName();

        Betas b = new Betas();
        b.start();
        try{
              b.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Alpha thread wake up");
        for(int i=1;i<=10;i++){
            System.out.println(name+"Thread is running by"+i);
        }
    }
}

class Betas extends Thread{

    @Override
    public void run(){
        String name = Thread.currentThread().getName();

        for(int i=1;i<=20;i++){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread can be interreputed");
            }
        }
    }
}
public class JoinsMain {

    public static void main(String[] args) {
        Alphas a = new Alphas();
        a.start();
    }

}
