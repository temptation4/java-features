package java10.immutableCollections;

import java.util.List;

import java.util.List;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Neelu"));
        List<Person> immutablePeople = List.copyOf(people);

        // Can't add/remove from immutablePeople, but:
        immutablePeople.get(0).setName("Changed!");

        // ☠️ Mutates original object because reference is shared
        System.out.println(immutablePeople);

    }
}



