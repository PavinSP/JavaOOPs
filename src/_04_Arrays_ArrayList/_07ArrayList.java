package _04_Arrays_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _07ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(); // slower than standard array
        ArrayList<Integer> list2 = new ArrayList<>(10); // 10 is the initial capacity
//        ArrayList list3 = new ArrayList(); // not suggested
        list.add(1);
        list.add(4);
        list.add(67);
        System.out.println(list);
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(5));
        list.set(0, 99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        for (int i = 0; i < 3; i++){
            list.add(scanner.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}