package java12.filemismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMismatchExample {
    public static void main(String[] args) throws IOException {

        Path file1 = Paths.get("src/main/resources/file1.txt");
        Path file2 = Paths.get("src/main/resources/file2.txt");

        // Write sample content
        Files.writeString(file1, "Hello Java 11");
        Files.writeString(file2, "Hello Java 12");


        long mismatchIndex = Files.mismatch(file1, file2);

        if (mismatchIndex == -1) {
            System.out.println("Files are identical");
        } else {
            System.out.println("Files differ at byte position: " + mismatchIndex);
        }
    }
}
