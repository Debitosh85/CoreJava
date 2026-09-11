package Arrays;

public class Dup {

  public static void main(String[] args) {

    int[] arr = { 1, 1, 2, 3, 4, 5, 5, 6 };
    int count =0;

    for (int i = 0; i < arr.length-1; i++) {
      for (int j = i + 1; j < arr.length-1; j++) {
        if (arr[i] == arr[j]) {
          count++;
          System.out.println("Duplicate element:"+arr[i]);
        }
      }
    }  
  }
}
