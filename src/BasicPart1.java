import java.util.Scanner;

public class BasicPart1 {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number:");
        double x = in.nextDouble();
        System.out.print("Input the second number:");
        double y = in.nextDouble();
        System.out.print("Input the third number:");
        double z = in.nextDouble();
        System.out.print("The smallest value is" + smallest(x,y,z) + "\n");
        System.out.println("The average" +  average(x,y,z));

    }

    private static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    private static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x,y),z);
    }



}
