package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Dog implements Pet{
    @Value("${dog.name}")
    private String name;

    public String getName() {
        return name;
    }
}
