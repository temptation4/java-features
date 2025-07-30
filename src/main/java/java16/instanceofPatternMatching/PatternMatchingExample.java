package java16.instanceofPatternMatching;

public class PatternMatchingExample {
    public static void main(String[] args) {
        printObject("Hello Java 16");
        printObject(42);
        printObject(3.14);
    }

    public static void printObject(Object obj) {
        if (obj instanceof String s) {
            System.out.println("It's a String in uppercase: " + s.toUpperCase());
        } else if (obj instanceof Integer i) {
            System.out.println("It's an Integer doubled: " + (i * 2));
        } else {
            System.out.println("Unknown type: " + obj);
        }
    }
}

