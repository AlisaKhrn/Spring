package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Human human = context.getBean("human", Human.class);
        System.out.println(human.getName());
        System.out.println(human.cat.getName());
        System.out.println(human.dog.getName());
        System.out.println(human.parrot1.getName());
        System.out.println(human.parrot2.getName());
        context.close();
    }
}