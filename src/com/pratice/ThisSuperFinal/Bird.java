package com.pratice.ThisSuperFinal;

public class Bird extends Car {
    private String type;

    public Bird(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bird Type: " + type);
    }
}
