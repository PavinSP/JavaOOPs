package _04_Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class _04MultidimensionalArray {
    public static void main(String[] args) {
    /*
        1 2 3
        4 5 6
        7 8 9
        3 rows, 3 columns
     */
        Scanner scanner = new Scanner(System.in);
//        int[][] arr = new int[3][]; // no of columns is not necessary to be specified
        // input
        int[][] arr2d = new int[3][3];
        for (int i = 0; i < arr2d.length; i++) { // no of rows
            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = scanner.nextInt();
            }
        }
        // output
        for (int i = 0; i < arr2d.length; i++){
            System.out.println(Arrays.toString(arr2d[i]));
        }
        for (int[] nums : arr2d){
            System.out.println(Arrays.toString(nums));
        }
    }
}
