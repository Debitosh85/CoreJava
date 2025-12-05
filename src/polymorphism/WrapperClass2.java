package polymorphism;

public class WrapperClass2 {

  public static void main(String[] args) {

    String str = "India";
    accept(str);
    System.out.println(str);
  }

  public static void accept(String x) {
    x = "Hindustan";
  }

}
