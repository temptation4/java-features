package java11.filesEnhanacement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Java11FileReadWriteExample {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("example.txt");

        // 🔸 Writing content to file
        String contentToWrite = "Hello from Java 11!";
        Files.writeString(filePath, contentToWrite);
        System.out.println("Content written successfully.");

        // 🔹 Reading content from file
        String readContent = Files.readString(filePath);
        System.out.println("Read content: " + readContent);
    }
}
