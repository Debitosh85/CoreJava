package deb.functionalinterface;

import java.util.Scanner;

@FunctionalInterface
interface Calculus {
  int doSum(int a,int b);
}

public class Calculate {
  public static void main(String[] args) {
    Calculus c = (a, b) -> a + b;
    Scanner sc = new Scanner(System.in);
    try(sc){
    System.out.println("Enter the number a:");
    int p = sc.nextInt();
    System.out.println("Enter the number b:");
    int q = sc.nextInt();
    System.out.println("Sum is:" + (c.doSum(p, q)));
  }catch (Exception e) {
    System.out.println(e.getMessage());
  }
  finally{
  sc.close();
  }
  }
}
