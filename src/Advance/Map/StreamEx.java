package Advance.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        int size = 1000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();
        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

        // Sequential Stream with delay
        long startSeq = System.currentTimeMillis();
        int delayedSum = nums.stream()
                .map(i -> {
                    try {
                        Thread.sleep(1); // Simulate a delay
                    } catch (InterruptedException e) {
                        System.err.println("Thread interrupted: " + e.getMessage());
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        // Sequential Stream without delay
        int sum1 = nums.stream()
                .map(i -> i * 2)
                .reduce(0, Integer::sum);

        // Sequential Stream using mapToInt
        int sum2 = nums.stream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();

        // Parallel Stream
        long startPar = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> i * 2)
                .mapToInt(i -> i)
                .sum();
        long endPar = System.currentTimeMillis();

        // Output Results
        System.out.println("Sum with delay (Sequential): " + delayedSum + " | Time: " + (endSeq - startSeq) + " ms");
        System.out.println("Sum without delay (Sequential): " + sum1);
        System.out.println("Sum using mapToInt (Sequential): " + sum2);
        System.out.println("Sum using Parallel Stream: " + sum3 + " | Time: " + (endPar - startPar) + " ms");
    }
}
