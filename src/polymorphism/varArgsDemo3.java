package polymorphism;
class Hetero {
  
  public void accept(Object... value) {
    for (Object values : value) {
      System.out.println(values+",");
    }
  }
}

public class varArgsDemo3 {
  public static void main(String[] args) {
    Hetero h = new Hetero();
    h.accept(10,20,"India",2.9,true,new String("Mera Bharat"),'c');
  }

}
