package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Cat implements Pet{
    @Value("${cat.name}")
    private String name;

    public String getName() {
        return name;
    }
}
