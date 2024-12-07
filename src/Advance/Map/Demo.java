package Advance.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("John Doe", 1);
        students.put("Heng", 2);
        students.put("San", 3);
        students.put("Sok", 4);

        System.out.println(students.get("John Doe"));
        System.out.println(students.get("Heng"));
        System.out.println(students);

        System.out.println(students.keySet());
        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
