package java9.unmodifiedCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTest {

    public static void main(String[] args) {
      /*  Null are not allowed here*/
        List<String> names = List.of("Alice", "Bob", "Charlie");
      /*  UnsupportedOperationException on this line
        names.add("test");*/
        System.out.println(names);

        /*No duplicates allowed → IllegalArgumentException if duplicates are passed*/
        Set<Integer> numbers = Set.of(1, 2, 3);

        System.out.println(numbers);

        /*Up to 10 entries are allowed*/
        Map<String, Integer> ages = Map.of("Alice", 25, "Bob", 30);

        /*Up to 10 entries are allowed*/
        Map<String, String> map = Map.ofEntries(
                Map.entry("A", "Apple"),
                Map.entry("B", "Banana"),
                Map.entry("C", "Cherry")
        );


        System.out.println(map);

    }
}
