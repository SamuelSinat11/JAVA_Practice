package Contructor;
/*Static Nested Class:
Write a Java program to create an outer class called University with a static nested class Department.
The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members.
Instantiate the Department class from the main method and call the "displayInfo()" method. */

public class University  {

    static class Department {
        private String name;
        private int faculty;

        public Department(String name, int faculty) {
            this.name = name;
            this.faculty = faculty;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Faculty: " + faculty);
        }
    }

    public static void main(String[] args) {
        Department d1 = new Department("CS", 50);
        Department d2 = new Department("Design", 45);
        d1.displayInfo();
        d2.displayInfo();
    }
}
