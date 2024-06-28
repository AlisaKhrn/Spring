package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Parrot2 implements Pet{
    @Value("${parrot2.name}")
    private String name;

    public String getName() {
        return name;
    }
}
