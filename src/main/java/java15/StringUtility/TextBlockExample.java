package java15.StringUtility;

public class TextBlockExample {

    public static void main(String[] args) {
        String json = """
            {
                "name": "Neelu",
                "role": "Java Developer",
                "experience": 11.5
            }
            """;

        System.out.println("JSON output using text block:");
        System.out.println(json);
    }
}

