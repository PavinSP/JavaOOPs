package _04_Arrays_ArrayList;

public class _11MaxItemInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        System.out.println(maxInRange(arr, 1, 3));
    }
    public static int maxInRange(int[] arr, int index1, int index2){
        int max = arr[index1];
        for (int i = index1+1; i <= index2; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
