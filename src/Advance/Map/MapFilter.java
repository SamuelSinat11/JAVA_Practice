package Advance.Map;

import java.util.Arrays;
import java.util.List;

public class MapFilter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 6, 7, 5, 3, 6, 8);

        // Filter and sort even numbers
        nums.parallelStream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(System.out::println);

        // Calculate the sum of double of even numbers
        int result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        System.out.println("Sum of double of even numbers: " + result);
    }
}
