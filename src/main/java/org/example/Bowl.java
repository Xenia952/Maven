package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public void reduceFood(int quantity) {
        if (food >= quantity) {
            food -= quantity;
        }
    }

    public void addFood(int quantity) {
        if (quantity > 0) {
            food += quantity;
            System.out.println("Добавлено " + quantity + " еды.");
        }
    }

    public int getFood() {
        return food;
    }
}
