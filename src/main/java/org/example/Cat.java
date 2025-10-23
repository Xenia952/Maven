package org.example;

public class Cat extends Animal {

    private boolean isFull;
    private static int countCats = 0;

    public Cat(String name) {
        super(name);
        countCats++;
        this.isFull = false;
    }

    @Override
    public void Run(int distance) {
        if (distance > 200) {
            System.out.println(name + " не может пробежать больше 200 м.  ");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void Swim(int distance) {
        System.out.println(name + " не умеет плавать. ");
    }

    public static int letCountCats() {
        return countCats;
    }

    public void eat(Bowl bowl, int foodAmount) {
        int check = bowl.getFood();
        if (check >= foodAmount) {
            bowl.reduceFood(foodAmount);
            isFull = true;
            System.out.println(name + " поел и теперь сыт.");
        } else {
            System.out.println(name + " не поел. Все еще голоден");
        }
    }
}
