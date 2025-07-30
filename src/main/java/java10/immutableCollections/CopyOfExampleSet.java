package java10.immutableCollections;

import java.util.Set;

public class CopyOfExampleSet {
    public static void main(String[] args) {
        Set<String> original = Set.of("A", "B", "C");
        Set<String> copy = Set.copyOf(original);

        System.out.println("Immutable Set:");
        copy.forEach(System.out::println);

        // copy.remove("A"); // ❌ UnsupportedOperationException
    }
}

