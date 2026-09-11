package matrix;

import java.util.*;
class MatrixTraverse{

  public static List<Integer> spiralOrder(int[][] matrix) {

    List<Integer> list = new ArrayList<>();

    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return list;
    }

    /*
    top -> top row 
    right -> Right most Column
    left -> left most Column 
    bottom -> bottom row 
     */

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {

      //Top row traversed
      for (int col = left; col <= right; col++) {
        list.add(matrix[top][col]);
      }
      top++;
      //top -1 ,bottom-2,left-0,right-3

      //Right most Column Values fetched(spiral) 
      for (int row = top; row <= bottom; row++) {
        list.add(matrix[row][right]);
      }
      //[1][3] , [2][3] fetched
      right--;
      //top = 1; left = 0;right = 2,bottom =2;

      if (top <= bottom) {
        for (int col = right; col >= left; col--) {
          list.add(matrix[bottom][col]);
        }
        bottom--;
      }
      //top =1 ,left =0; right =2;bottom=1;

      if (left <= right) {
        for (int row = bottom; row >= top; row--) {
          list.add(matrix[row][left]);
        }
        left++;
      }

    }
    return list;
  }
}

public class MatrixMain {
  public static void main(String[] args) {
      
    int matrix[][] ={
      //{1,2,3,4},
       //{5,6,7,8},
        //{9,10,11,12}
    };

    List<Integer> li = MatrixTraverse.spiralOrder(matrix);
    System.out.println(li);
  }
}
