package java10.immutableCollections;

import java.util.List;

public class CopyOfExampleList {
    public static void main(String[] args) {
        List<String> original = List.of("Java", "Python", "Go");
        List<String> copy = List.copyOf(original); // Immutable copy

        System.out.println("Immutable List:");
        copy.forEach(System.out::println);

        // copy.add("Rust"); // ❌ UnsupportedOperationException
    }
}

