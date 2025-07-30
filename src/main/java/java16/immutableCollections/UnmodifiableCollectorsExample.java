package java16.immutableCollections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableCollectorsExample {
    public static void main(String[] args) {
        List<String> names = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.toUnmodifiableList());
        //same as names
        List<String> names1 = Stream.of("Alice", "Bob", "Charlie")
                .toList();

        System.out.println(names1);

        // names.add("David"); // Throws UnsupportedOperationException
    }
}

