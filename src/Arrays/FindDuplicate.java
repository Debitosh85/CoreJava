package Arrays;

public class FindDuplicate {

  public static void main(String[] args) {
      
    int[] arr = { 10, 20, 10, 30, 40, 30 };
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        if (arr[i] == arr[j] ) {
          System.out.println(arr[i]);
          found = true;
        } 
      }
    }
    if (!found) {
      System.out.println("Duplicate Elements not found");
    }
}
}
