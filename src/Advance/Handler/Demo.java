package Advance.Handler;

public class Demo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int nums[] = new int [5];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit.");
        } catch(Exception e)
        {
            System.out.println("Something went Wrong");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
