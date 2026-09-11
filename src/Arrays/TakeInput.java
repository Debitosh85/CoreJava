package Arrays;

import java.util.*;
public class TakeInput {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int val = 0;
    int[] arr = new int[3];
    for (int i = 0; i<arr.length; i++) {
      System.out.println("Enter the Value to store in" + val + "index");
      val++;
      int num = sc.nextInt();
      arr[i] = num;
    }
    for (int i=0; i<arr.length; i++) {
      System.out.println("Value stored in index :"+i+"is :"+arr[i]);
    }
    sc.close();
  }
}
