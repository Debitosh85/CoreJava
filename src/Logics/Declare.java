package Logics;

import java.util.*;

public class Declare {

public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int arr[] = new int[6];

  System.out.println("Enter 6 size array :");
  for (int i = 0; i < arr.length; i++) {
    arr[i] = sc.nextInt();
  }
  System.out.println("print the Values of array");
  for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
  }
  sc.close();
}

}
