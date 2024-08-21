package _04_Arrays_ArrayList;

public class _01Main {

    public static void main(String[] args) {

        // store a roll no
        int a = 10;

        // store a name
        String b = "Pavin";

        // store 5 roll nos
        int roll1 = 1;
        int roll2 = 2;
        int roll3 = 3;
        int roll4 = 4;
        int roll5 = 5;

        // arrays (syntax)
        // datatype[] variable_name = new datatype[size];
        // store 5 roll nos
        int[] roll_no = new int[5];
        // or directly
        int[] roll_no2 = {1, 2, 3, 4, 5};

        int[] ros; // declaration of array (defined inside the stack)
        ros = new int[5]; // initialization: actual memory created (object is being created in the heap memory)

        for (int i = 0; i < ros.length; i++){
            System.out.print(ros[i]); // default value of integer array is 0
        }

        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
