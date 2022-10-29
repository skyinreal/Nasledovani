package com.company;

public class Animal {
    protected String name;
    protected int age;
    protected int speed;
    public static int numberOfLegs;

    public Animal(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println(name + "двигается со скоростью" + speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
