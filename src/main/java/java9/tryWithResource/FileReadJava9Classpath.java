package java9.tryWithResource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class FileReadJava9Classpath {
    public static void main(String[] args) {
        // Load file from resources using classpath
        InputStream inputStream = FileReadJava9Classpath.class.getResourceAsStream("/example.txt");

        if (inputStream == null) {
            System.out.println("File not found in resources.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = reader.readLine();
            System.out.println("First Line: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
