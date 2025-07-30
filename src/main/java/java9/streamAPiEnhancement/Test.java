package java9.streamAPiEnhancement;

import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 6, 8, 9, 10);
        list.stream()
                .takeWhile(n -> n % 2 == 0)
                .forEach(System.out::println);
// Output: 2, 4, 6, 8

        list.stream()
                .dropWhile(n -> n % 2 == 0)
                .forEach(System.out::println);
// Output: 9, 10

        Stream.ofNullable("Hello").forEach(System.out::println); // Hello
        Stream.ofNullable(null).forEach(System.out::println);    // (nothing)

        Stream.iterate(1, n -> n < 10, n -> n + 2)
                .forEach(System.out::println);
// Output: 1, 3, 5, 7, 9



    }
}
