package org.example;

public class Human {
    private String name;
    Pet cat;
    Pet dog;
    Pet parrot1;
    Pet parrot2;

    public String getName() {
        return name;
    }

    public Human(Pet cat, Pet dog, Pet parrot1, Pet parrot2){
        this.cat = cat;
        this.dog = dog;
        this.parrot1 = parrot1;
        this.parrot2 = parrot2;
    }
}

