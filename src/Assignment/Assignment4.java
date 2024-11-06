package Assignment;

public class Assignment4 {
    public static void main(String[] args) {
        int num[] = {23, 30, 45, 17, 50};

        System.out.print("Even numbers: ");
        for (int n : num) {
            if (n % 2 == 0) {  // Checks if the number is even
                System.out.print(n + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int n : num) {
            if (n % 2 != 0) {  // Checks if the number is odd
                System.out.print(n + " ");
            }
        }
    }
}

