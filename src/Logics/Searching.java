package Logics;
import java.util.*;
public class Searching {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try (sc) {
    int[] arr = { 2, 4, 9, 10 };
    boolean result = false;
    System.out.println("Enter the Element to Search");
    int no = sc.nextInt();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == no) {
        System.out.println( "Target Element :" + arr[i] + "\t" + "is found in the index" + "\t" + i + "Lets Stop the Execution");
        result = true;
        break;
      }
    }
    if (!result) {
      System.out.println("Target Element not found");
    }
    sc.close();
    } catch (Exception e) {
      e.getMessage();
   }
  }

}
