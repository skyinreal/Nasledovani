package com.company;

import java.util.Objects;

public class Cat extends Animal {

    public String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public void qwerty(){
        numberOfLegs = 4;
    }

    @Override
    public void move() {
        System.out.println(name + " "+"двигается со скоростью"+" " + speed);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
