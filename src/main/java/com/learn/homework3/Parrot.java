package com.learn.homework3;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public java.lang.String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
