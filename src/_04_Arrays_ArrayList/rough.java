package _04_Arrays_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class rough {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1000000000; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}