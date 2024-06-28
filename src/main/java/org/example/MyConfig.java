package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:value")
public class MyConfig {
    @Bean
    public Pet cat(){
        return new Cat();
    }
    @Bean
    public Pet dog(){
        return new Dog();
    }
    @Bean
    public Pet parrot1(){
        return new Parrot1();
    }
    @Bean
    public Pet parrot2(){
        return new Parrot2();
    }
    @Bean
    Human human(){
        return new Human(cat(), dog(), parrot1(), parrot1());
    }
}
