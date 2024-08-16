package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OOPsPractice {
    public static void main(String[] args) {
//        student student1 = new student();
//        student1.rollno = 1;
//        student1.name = "Ansh";
//        student1.marks = 50;
//        System.out.println(student1.rollno + " " + student1.name + " " + student1.marks);

        student student2 = new student(2, "Akash", 40);
        System.out.println(student2.rollno + " " + student2.name + " " + student2.marks);
    }

    static class student {
        int rollno;
        String name;
        float marks;

        student(int rollno, String name, float marks, int age){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    }
}
