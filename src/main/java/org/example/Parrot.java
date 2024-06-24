package org.example;

public class Parrot implements Pet {
    public final String name;

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
