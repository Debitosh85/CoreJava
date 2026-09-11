package Arrays;

import java.util.*;
public class RemoveTarget {

  public static void main(String[] args) {

    int[] arr = { 2, 4, 6, 8, 10, 12, 14 };
    int size = arr.length;

    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();

    for (int i = 0; i < size; i++) {
      if (target == arr[i]) {
        for (int j = i; j < size - 1; j++) {
          arr[j] = arr[j + 1];
        }
        size --;
        break;
      }
    }
    for (int k = 0; k < size; k++) {
      System.out.println(arr[k]);
    }
  }
}
