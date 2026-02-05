package com.learn.homework1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext();

        Parrot parrot = new Parrot();
    }
}
