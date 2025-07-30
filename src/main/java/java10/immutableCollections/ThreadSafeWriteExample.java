package java10.immutableCollections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ThreadSafeWriteExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Runnable writer = () -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i); // Safe now
            }
        };

        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("List size: " + list.size()); // ✅ Always 2000
    }
}

