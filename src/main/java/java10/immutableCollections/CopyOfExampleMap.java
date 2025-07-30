package java10.immutableCollections;

import java.util.Map;

public class CopyOfExampleMap {
    public static void main(String[] args) {
        Map<String, Integer> original = Map.of("Java", 10, "Python", 20);
        Map<String, Integer> copy = Map.copyOf(original);

        System.out.println("Immutable Map:");
        copy.forEach((k, v) -> System.out.println(k + " => " + v));

        // copy.put("Go", 30); // ❌ UnsupportedOperationException
    }
}

