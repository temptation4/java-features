package java15.StringUtility;

public class Java15StringFeatures {
    public static void main(String[] args) {
        // Using formatted()
        String message = "Welcome %s! You are logged in as %s.".formatted("Neelu", "Admin");
        System.out.println(message);

        // Using translateEscapes()
        String rawString = "Path:\\\\User\\nDocuments\\tFiles";
        System.out.println("Raw: " + rawString);

        String interpreted = rawString.translateEscapes();
        System.out.println("Interpreted: " + interpreted);
    }
}

