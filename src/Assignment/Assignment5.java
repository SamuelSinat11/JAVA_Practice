package Assignment;

public class Assignment5 {

    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private char gender;
        private String department;

        public Student(String firstName, String lastName, int age, char gender, String department) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.department = department;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
        public int getAge() {
            return age;
        }
        public char getGender() {
            return gender;
        }
        public String getDepartment() {
            return department;
        }

        public void IdentityInfo () {
            System.out.println("Identity Information");
            System.out.println("firstName: " + firstName );
            System.out.println("lastName: " + lastName );
            System.out.println("age: " + age );
            System.out.println("gender: " + gender );
            System.out.println("department: " + department );

        }

    }

    public static void main(String[] args) {
        Student student1 = new Student("Samuel", "Sinat",21, 'F',"CS");
        student1.IdentityInfo();
    }
}
