package Contructor;

import java.util.Arrays;

public class ContructorExecerise {
    public static void main(String[] args) {
        String StudentArray = Arrays.toString(new String[]{"samuel", "Heng", "Kim"});

        School list1 = new School("learning" + StudentArray);
        list1.printClassRoom();
    }

    // Constructor with Array Initialization
    //Write a Java program to create a class called Classroom with instance
    // variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables.
    // Print the values of the variables.

    static class School {
        private String className;
        private String [] students;

        public School(String className) {
            this.className = className;
        }

        public void printClassRoom() {
           System.out.println("ClassName" + className);
           System.out.println("Students" );
           for (String student : students) {
               System.out.println(student + "");
           }
           System.out.println();
        }


    }
}
