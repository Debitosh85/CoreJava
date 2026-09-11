package Logics;

public class SecondLargest {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 4, 5, 7, 9, 10, 23 };
    int lrgst = Integer.MIN_VALUE;
    int slrgst = Integer.MIN_VALUE;
    int tlrgst = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > lrgst) {
        tlrgst = slrgst;
        slrgst = lrgst;
        lrgst = arr[i];
      }
      else if (arr[i] > slrgst) {
        tlrgst = slrgst;
        slrgst = arr[i];
      }
      else if (arr[i] > tlrgst) {
        tlrgst = arr[i];
      }
    }
    System.out.println("Largest::" + lrgst + "\n" + "Second Largest::" + slrgst +"\n"+ "ThridL::" + tlrgst);
  }
}
