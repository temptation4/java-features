package java10.TypeInReference;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class VarExample {

    public static void main(String[] args) {
        var name = "Neelu Sahai";
        var age = 30;
        var price = 99.99;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);

        var fruits = List.of("Apple", "Banana", "Cherry");
        for (var fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        var map = new HashMap<String, Integer>();
        map.put("Java", 10);
        map.put("Python", 20);

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        try (var scanner = new Scanner(System.in)) {
            System.out.print("Enter something: ");
            var input = scanner.nextLine();
            System.out.println("You entered: " + input);
        }
    }
}
