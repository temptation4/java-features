package java12.StringUtility;

public class StringIndentExample {
    public static void main(String[] args) {
        String text = "Java\nSpring Boot\nMicroservices";

        // Add 4 spaces indentation
        String indented = text.indent(4);
        System.out.println("Indented:\n" + indented);

        // Remove indentation (negative value)
        String unindented = indented.indent(-2); // Removes 2 spaces if present
        System.out.println("Unindented:\n" + unindented);
    }
}

