package Logics;

import java.util.Scanner;

public class RemoveTarget {
  public static void main(String[] args) {
      
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int size = arr.length;
    boolean found = false;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the target Element to remove...");
    int target = sc.nextInt();

    for (int i = 0; i < size; i++) {
      if (arr[i] == target) {
        found = true;
        for (int j = i; j < size-1; j++) {
          arr[j] = arr[j + 1];
        }
        size--;
        break;
      }
    }
    if (found) {
      System.out.println("After removing Target");
     for (int k = 0; k < size; k++) {
       System.out.println(arr[k]);
     }
   } else {
     System.out.println("Target Element not exist in the array.");
   }
   sc.close();
  }
}
