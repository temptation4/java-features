package java9.processApi;

import java.io.IOException;

public class StartProcess {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = new ProcessBuilder("open", "-a", "TextEdit").start(); // Windows example
        ProcessHandle handle = process.toHandle();

        System.out.println("Started Notepad with PID: " + handle.pid());

        handle.onExit().thenRun(() -> {
            System.out.println("Process terminated: " + handle.pid());
        });

        // Optional: wait explicitly
        process.waitFor();
    }
}
