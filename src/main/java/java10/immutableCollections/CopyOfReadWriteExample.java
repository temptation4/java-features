package java10.immutableCollections;

import java.util.List;

public class CopyOfReadWriteExample {
    public static void main(String[] args) {
        List<String> original = List.of("A", "B", "C");
        List<String> immutableList = List.copyOf(original); // Immutable copy

        // Thread 1: READ
        Thread reader = new Thread(() -> {
            for (String s : original) {
                System.out.println("Read: " + s);
            }
        });

        // Thread 2: WRITE (fails)
        Thread writer = new Thread(() -> {
            try {
                immutableList.add("D"); // Throws UnsupportedOperationException
            } catch (UnsupportedOperationException e) {
                System.out.println("Write failed: Immutable list cannot be modified");
            }
        });

        reader.start();
        writer.start();
    }
}
