package Logics;

public class StrnLogics {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hi");
    StringBuilder sb2 = new StringBuilder("Hi");
    if (sb.equals(sb2)) {
      System.out.println("equals");
    } else {
      System.out.println("Not equal");
    }
  }

}
