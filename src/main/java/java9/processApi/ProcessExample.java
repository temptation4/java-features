package java9.processApi;

public class ProcessExample {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current PID: " + currentProcess.pid());

        ProcessHandle.Info info = currentProcess.info();
        info.command().ifPresent(cmd -> System.out.println("Command: " + cmd));
        info.startInstant().ifPresent(start -> System.out.println("Started at: " + start));
        info.user().ifPresent(user -> System.out.println("User: " + user));

        ProcessHandle.allProcesses()
                .filter(ph -> ph.info().command().isPresent())
                .forEach(ph -> {
                    System.out.println("PID: " + ph.pid() + " - " + ph.info().command().get());
                });
    }
}
