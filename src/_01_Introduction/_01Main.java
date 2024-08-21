package _01_Introduction;

public class _01Main {

    public static void main(String[] args){

        // create a datatype that stores roll no of 5 students
        int[] nums = new int[5]; // stores 5 roll no's (integer)

        // create a datatype that stores names of 5 students
        String[] names = new String[5]; // stores 5 names (String)

        // create a datatype that stores data of 5 students (roll no, name, marks)
        // {roll_no, name, marks}
        int[] roll = new int[5];
        String[] name = new String[5];
        double[] marks = new double[5]; // but the objective is to do it in a single line

        // It is required in the following way
        Student[] students = new Student[5];

        // just declaring
//        Student pavin; // consists of three properties (roll, name, marks)
//        pavin = new Student();

        Student pavin = new Student();

        System.out.println(pavin);
        System.out.println(pavin.roll);
        System.out.println(pavin.name);
        System.out.println(pavin.marks);

        pavin.roll = 1;
        pavin.name = "Pavin";
        pavin.marks = 97.5d;

        System.out.println(pavin.roll);
        System.out.println(pavin.name);
        System.out.println(pavin.marks);
        pavin.greeting();
        pavin.changeName("Rohit");
        pavin.greeting();

        Student rohit = new Student(12, "Rohit", 88.2);
        System.out.println(rohit.roll + " " + rohit.name + " " + rohit.marks);

        Student other = new Student(rohit);
        System.out.println(other.roll);
        System.out.println(other.name);
        System.out.println(other.marks);

        Student random = new Student();
        System.out.println(random.name);
        System.out.println(random.roll);
        System.out.println(random.marks);

        Student one = new Student();
        Student two = one;
        System.out.println(one.name + " " + two.name);
        one.name = "Something";
        System.out.println(one.name + " " + two.name);

    }
}

// create a class
// every single student had a roll no, name and marks
class Student {

    int roll;
    String name;
    double marks;

    void greeting(){
        System.out.println("Hello " + this.name);
    }

    void changeName(String newName){
        this.name = newName;
    }

    Student() {
        // this is how you call a constructor using another constructor.
        this(0, "Default person", 0.0);
    }

    Student(int roll, String name, double marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other){
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

}
