package matrix;

import java.util.Arrays;

public class Matrix {
  public static void main(String[] args) {
    int[][] array =new int[][]{
        { 1, 3, 6, 2},
        {4, 5, 6, 1},
        {3, 3, 1, 5},
        {9, 0, 5, 2}
    };
    System.out.println(Arrays.deepToString(array));
    System.out.println(Arrays.deepToString(multiplyMatrixItems(array)));

  }
  public static int[][] multiplyMatrixItems(int[][] array){
    for (int i = 0; i < array.length ; i++) {
      for (int j = 0; j <array[i].length ; j++) {
        if(i%2==1 && array[i][j]%2==0){
          array[i][j]*=2;
        }
      }
    }return array;
  }
}
