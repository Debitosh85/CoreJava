package Arrays;

import java.util.*;
public class Hetero {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
   
    //Object[] o = new Integer[10];
    Integer[] n = new Integer[10];
    /* System.out.println("Enter the Value for array::");
    for (int i = 0; i < n.length; i++) {
      n[i] = sc.nextInt();
    }
    
    System.out.println("Values are in the array::");
    for (int j = 0; j < n.length; j++) {
      System.out.println(n[j]);
    } */

    System.out.println("Enter target element to remove from the array::");
    int num = sc.nextInt();

    for (int k = 0; k < n.length; k++) {
      if (num == n[k]) {
        for (int m = k; m < n.length - 1; m++) {
          n[m] = n[m + 1];
        }
        n[n.length - 1] = null;
        break;
      }
    }

    System.out.println("Values after removal::");
    for (int j = 0; j < n.length; j++) {
      System.out.println(n[j]);
    }

  }
}
