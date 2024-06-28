package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Parrot1 implements Pet{
    @Value("${parrot1.name}")
    private String name;

    public String getName() {
        return name;
    }
}
