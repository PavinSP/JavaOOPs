package _04_Arrays_ArrayList;

import java.util.ArrayList;

public class _08MultiDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // initialization
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
        // adding elements
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                list.get(i).add(i);
            }
        }
        System.out.println(list);
    }
}
