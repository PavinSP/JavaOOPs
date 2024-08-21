// Write a Java program that allows the user to create a 2D matrix
// where each row can have a different number of columns.
// The program should take user input to specify the number of rows,
// the number of columns for each row,
// and the elements of the matrix.
// Finally, the program should display the matrix.
package _04_Arrays_ArrayList;
import java.util.Scanner;
public class _06Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        int[][] arr = new int[rows][];
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter the number of columns for row " + i + ": ");
            int columns = scanner.nextInt();
            arr[i] = new int[columns]; // initializes each row with the no of columns (crucial step)
            System.out.println("Enter the elements for row " + i + ": ");
            for (int j = 0; j < columns; j++){
                System.out.print("Element at (" + i + "," + j + "): ");
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter the number of rows: 3

Enter the number of columns for row 0: 3
Enter the elements for row 0:
Element at (0,0): 1
Element at (0,1): 2
Element at (0,2): 3

Enter the number of columns for row 1: 2
Enter the elements for row 1:
Element at (1,0): 4
Element at (1,1): 5

Enter the number of columns for row 2: 4
Enter the elements for row 2:
Element at (2,0): 6
Element at (2,1): 7
Element at (2,2): 8
Element at (2,3): 9

The 2D matrix is:
1 2 3
4 5
6 7 8 9
 */