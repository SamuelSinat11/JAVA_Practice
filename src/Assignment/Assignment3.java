package Assignment;

public class Assignment3 {
    public static void main(String[] args) {

        int grade = 98;

        if ( grade >= 95 && grade <=100 ) {
            System.out.println("Grade A");
        } else if ( grade >= 83 && grade <=94 ) {
            System.out.println("Grade B");
        } else if ( grade >= 82 && grade <=70 ) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade F");
        }
    }
}
