package java19;

public class VirtualThreadExample {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            System.out.println("Running in a virtual thread: " + Thread.currentThread());
        });
    }
}

