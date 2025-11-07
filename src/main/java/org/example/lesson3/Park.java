package org.example.lesson3;
import java.util.List;
import java.util.ArrayList;

public class Park {
    private String name;
    private List<Attraction> attractions;

    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String schedule, double price) {
        this.attractions.add(new Attraction(name, schedule, price));
    }

    public void showInfo(){
        System.out.println("Park name: " + this.name);
        for (Attraction attraction : attractions) {
            System.out.println("Аттракцион: " + attraction.getName()
                    + ", Время работы: " + attraction.getSchedule()
                    + ", Цена: " + attraction.getPrice() + " руб.");
        }
    }

    public class Attraction {
        private String name;
        private String schedule;
        private double price;

        public Attraction(String name, String schedule, double price) {
            this.name = name;
            this.schedule = schedule;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getSchedule() {
            return schedule;
        }

        public double getPrice() {
            return price;
        }
    }
}
