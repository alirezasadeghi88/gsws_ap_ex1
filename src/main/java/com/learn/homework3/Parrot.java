package com.learn.homework3;


public class Parrot {
    private String name;

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
