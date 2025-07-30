package java11.StringUtility;

import java.util.stream.Collectors;

public class Java11StringUtils {
    public static void main(String[] args) {
        String blankStr = "   \t   ";
        System.out.println("isBlank(): " + blankStr.isBlank()); // true

        String multiline = "Java 11\nis awesome\nnew features";
        System.out.println("lines():");
        multiline.lines()
                .forEach(System.out::println); // Streams each line

        String messy = "   Hello Java 11   ";
        System.out.println("Original: >" + messy + "<");
        System.out.println("strip(): >" + messy.strip() + "<");
        System.out.println("stripLeading(): >" + messy.stripLeading() + "<");
        System.out.println("stripTrailing(): >" + messy.stripTrailing() + "<");

        String repeat = "Neelu ";
        System.out.println("repeat(3): " + repeat.repeat(3));
    }
}
