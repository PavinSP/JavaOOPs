package _04_Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class _02Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        // arrays of primitives
//        int[] arr = new int[5];
//
//        arr[0] = 23;
//        arr[1] = 45;
//        arr[2] = 233;
//        arr[3] = 54;
//        arr[4] = 22;
//
//        System.out.println(arr[0]);
//
//        // input using for loops
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        // enhanced for loop
//        for (int i : arr){ // i represents the element of the array
//            System.out.print(i);
//        }
//
//        System.out.println(Arrays.toString(arr));


        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = scanner.nextLine();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[0] = "Pavin";

        System.out.println(Arrays.toString(str));

    }
}
