package org.example.lesson4;

public class Animal {
    public String name;
    private static int countAnimals = 0;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public void Run(int distance) {
        System.out.println(this.name + " пробежал " + distance + " м.");
    }

    public void Swim(int distance) {
        System.out.println(this.name + " проплыл " + distance + " м.");
    }

    public static int letCountAnimals() {
        return countAnimals;
    }
}
