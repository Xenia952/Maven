package org.example.lesson4;

public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public void Run(int distance) {
        if (distance > 500) {
            System.out.println(name + " не может пробежать больше 500 м.  ");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void Swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не может проплыть больше 10 м. ");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }

    public static int letCountDog() {
        return countDogs;
    }
}
