package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot2 implements Pet {
    private final String name;

    public Parrot2(@Value("${parrot1.name}") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
