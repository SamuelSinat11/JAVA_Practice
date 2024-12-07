package Advance.Map;

import java.util.*;

public class Computer {
    public static void main(String[] args) {

        Map<String, Integer> monitorStock = new HashMap<>();
        monitorStock.put("MIS", 100);
        monitorStock.put("Samsung", 150);
        monitorStock.put("Asus", 180);
        monitorStock.put("Tesla", 120);


        System.out.println("The Monitor that have in stock:");
        for (String key : monitorStock.keySet()) {
            System.out.println(key + ": " + monitorStock.get(key));
        }

        // Comparator to sort by the last digit of the price
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(monitorStock.entrySet());
        entryList.sort((entry1, entry2) -> {
            int lastDigit1 = entry1.getValue() % 10;
            int lastDigit2 = entry2.getValue() % 10;
            return Integer.compare(lastDigit1, lastDigit2);
        });

        // Display sorted monitors by price last digit
        System.out.println("Sorted by the last digit of the price:");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
