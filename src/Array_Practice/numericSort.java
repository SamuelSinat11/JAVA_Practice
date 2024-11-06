package Array_Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class numericSort {
    public static void main(String[] args) {

        int[] my_array1 = {
                1243,6346,7674,234,23423,65346,7678,5434
        };

        String[] my_array2 = {
                "java", "C++", "HTML", "CSS", "Tailwind", " JAVASCRIPT", "KOTLIN"
        };

        int[] number1 = {
                12,5646,7457,8734,345,234,6,23,6
        };

        System.out.println("Original Array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted Array: " + Arrays.toString(my_array1));

        System.out.println("Original Array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted Array: " + Arrays.toString(my_array2));

        //Sum Value
        int sum = 0;

        // Calculate the value of arrayNumber
        for (int i = 0; i < number1.length; i++) {
            sum += number1[i];
        }
        System.out.println("Sum: " + sum);

        // Calculate the average of arrayNumber
        double average = sum / number1.length;
        System.out.println("Average : " + average);
    }
}
