package _04_Arrays_ArrayList;

import java.util.Arrays;

public class _03PassingInFunctions {

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 12};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){ // both arr and nums are pointing to same object
        arr[0] = 99;
    }
}
