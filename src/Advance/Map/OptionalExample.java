package Advance.Map;

import java.util.Arrays;
import java.util.List;

public class OptionalExample { // Renamed class to avoid conflict with java.util.Optional
    public static void main(String[] args) {

        List<String> namesList = Arrays.asList("Samuel", "Many", "Mana", "Rotana", "Heng");

        String result = namesList.stream()
                .filter(str -> str.contains("Ma"))
                .findFirst()
                .orElse("Not Found");
        System.out.println(result);

        List<String> Classmate = namesList.stream()
                        .map(String::toUpperCase)
                        .toList();

        Classmate.forEach(System.out::println);

    }
}
