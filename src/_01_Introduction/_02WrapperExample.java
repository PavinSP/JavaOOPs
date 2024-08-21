package _01_Introduction;

import org.w3c.dom.ls.LSOutput;

public class _02WrapperExample {

    public static void main(String[] args) {

        int a = 10; // not an object
        int b = 20;
        Integer c = 45; // is an object

        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b); // will not print 20 10 because it swaps inside the function only

        System.out.println();

        Integer d = 55;

        System.out.println(c + " " + d);
        swap(c, d); // same case
        System.out.println(c + " " + d);

        final int INCREASE = 2; // the value doesn't change for primitive types

        final A pavin = new A("Pavin");
        System.out.println(pavin.name);
        pavin.name = "Rohit"; // can change the properties of the object even when it is final
        System.out.println(pavin.name);
//        pavin = new A("ABC"); // not possible as object is final so it cannot be referenced to another object

        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random");
        }

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

}

class A{

    final int num = 10;
    String name;

    A(String name){
//        System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
