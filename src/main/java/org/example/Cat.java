package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    private final String name;

    public Cat(@Value("${cat.name}") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

