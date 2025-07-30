package java12.StringUtility;

public class StringTransformExample {
    public static void main(String[] args) {
        String name = "neelu sahai";

        // Capitalize using transform
        String upper = name.transform(str -> str.toUpperCase());
        System.out.println("Upper: " + upper);

        // Trim and reverse
        String result = name
                .transform(String::trim)
                .transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println("Reversed: " + result);
    }
}

