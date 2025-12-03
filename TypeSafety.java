package general;

import java.util.*;

public class TypeSafety {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arun");
        names.add("Bala");
        names.add("Charan");

        System.out.println("Names List: " + names);

        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Numbers Set: " + numbers);

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Arun");
        studentMap.put(2, "Bala");
        studentMap.put(3, "Charan");

        System.out.println("Student Map: " + studentMap);


        // Iterating using enhanced for loop
        System.out.println("\nIterating List:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("\nIterating Map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " =" + entry.getValue());
        }

    }
}