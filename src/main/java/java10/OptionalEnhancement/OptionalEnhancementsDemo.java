package java10.OptionalEnhancement;


import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalEnhancementsDemo {

    public static void main(String[] args) {

        // 1. orElseThrow() without arguments (Java 10)
        Optional<String> nonEmptyOpt = Optional.of("Neelu Sahai");
        Optional<String> emptyOpt = Optional.empty();

        // This will print the value
        System.out.println("orElseThrow (non-empty): " + nonEmptyOpt.orElseThrow());

        try {
            // This will throw NoSuchElementException
            System.out.println("orElseThrow (empty): " + emptyOpt.orElseThrow());
        } catch (NoSuchElementException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }

        System.out.println("------------------------------------");

        // 2. ifPresentOrElse() (Java 10)
        Optional<String> nameOpt = Optional.of("Java 10");

        nameOpt.ifPresentOrElse(
                value -> System.out.println("Name is: " + value),
                () -> System.out.println("No name provided.")
        );

        Optional<String> emptyNameOpt = Optional.empty();

        emptyNameOpt.ifPresentOrElse(
                value -> System.out.println("Name is: " + value),
                () -> System.out.println("No name provided.")
        );

        System.out.println("------------------------------------");

        // Bonus: Real-world use case
        Optional<String> userInput = getUserInput("  "); // Simulate blank input

        userInput
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .ifPresentOrElse(
                        input -> System.out.println("Valid input: " + input),
                        () -> System.out.println("Please enter a valid name.")
                );
    }

    // Simulated user input (could be from Scanner or UI)
    private static Optional<String> getUserInput(String input) {
        return Optional.ofNullable(input);
    }
}
