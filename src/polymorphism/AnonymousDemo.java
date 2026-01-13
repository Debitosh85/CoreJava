package polymorphism;

class Supreme {
  public void show() {
    System.out.println("Hello");
  }
}

public class AnonymousDemo {
  public static void main(String[] args) {
    //Annonymous inner Class
    Supreme sub = new Supreme()
    {
       public void show(){
        System.out.println("Sub class inside Main");
       }
    };
    System.out.println(sub.getClass().getName());
  }
}
