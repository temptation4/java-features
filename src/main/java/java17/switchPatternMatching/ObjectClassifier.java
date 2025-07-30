package java17.switchPatternMatching;

public class ObjectClassifier {
    public static void main(String[] args) {
        Object obj = 42;

        String result = switch (obj) {
            case Integer i -> "Integer with value: " + i;
            case String s -> "String with length: " + s;
            case Double d -> "Double with value: " + d;
            case null -> "Null object";
            default -> "Unknown type: " + obj.getClass().getName();
        };

        System.out.println(result);
    }
}

