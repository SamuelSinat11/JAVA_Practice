package Advance.ArrayList;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection nums = new ArrayList <Integer>();
        nums.add(3);
        nums.add(5);
        nums.add(7);
        nums.add(9);

        for(Object n : nums)
        {
            int num = (Integer) n;
            System.out.println(num * 2);
        }

        Set<Integer> score = new HashSet<>() {
        };
        score.add(5);
        score.add(7);
        score.add(9);
        score.add(3);
        score.add(2);

        for (Integer n : score)
        {
            System.out.println(n);
        }

    }
}
