package java16.records;

public class RecordExample {
    public static void main(String[] args) {
        User user = new User("Neelu", 30);
        System.out.println(user.name()); // Neelu
        System.out.println(user.age());  // 30
        System.out.println(user);        // User[name=Neelu, age=35]
    }

    public record User(String name, int age) {}
}

