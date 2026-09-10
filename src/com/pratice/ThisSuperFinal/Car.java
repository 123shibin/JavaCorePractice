package com.pratice.ThisSuperFinal;

public class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Color: " + color);
    }
}
