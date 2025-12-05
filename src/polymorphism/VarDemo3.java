package polymorphism;
class Heteros {
  
  public void accept(Object... value) {
    for (Object values : value) {
      System.out.println(values+",");
    }
  }
}

public class VarDemo3 {
  public static void main(String[] args) {
    Heteros h = new Heteros();
    h.accept(10,20,"India",2.9,true,new String("Mera Bharat"),'c');
  }

}
