package Logics;
import java.util.*;
public class Palleindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try (sc;) {
    System.out.println("Enter the no to check...");
    int num = sc.nextInt();
    int temp=num;
    int sum =0;
    while (num > 0) {
      int r = num % 10;
      sum = sum * 10 + r;
      num = num / 10;
    }
    if (temp == sum) {
      System.out.println(temp+"is Pallendrome no..");
    } else {
      System.out.println(temp + "is not Pallendrome no..");
    }
        
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
}
