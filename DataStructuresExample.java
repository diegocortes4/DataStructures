import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class DataStructuresExample {
    public static void main(String[] args) {
        // 1. Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Array Example:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Lists (ArrayList)
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        System.out.println("\nArrayList Example:");
        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        // 3. Sets (HashSet)
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(3); // Duplicate, ignored
        System.out.println("\nHashSet Example:");
        for (int num : integerSet) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Maps (HashMap)
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("John", 30);
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 35);
        System.out.println("\nHashMap Example:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }
    }
}
