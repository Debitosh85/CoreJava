package practice;

/* public class MethodChain {

  public static void main(String[] args) {
    
    String str = "India";
    char ch = str.concat("is great").toUpperCase().charAt(0);
    System.out.println(ch);
  }

} */

public class MethodChain {

  public static void main(String[] args) {
    
    String str = "Hydrabad";

    int len = str.concat("is great").toLowerCase().length();

    System.out.println("The Length of the String is:" + len);

  }
}
