package org.example;

public class Product {
    private String name;
    private String date;
    private String manufacturer;
    private String country;
    int price;
    boolean booking;

    public Product(String name, String date, String manufacturer, String country, int price, boolean booking) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.booking = booking;
    }

    public void printInfo() {
        System.out.println("название: " + name);
        System.out.println("дата производства: " + date);
        System.out.println("производитель: " + manufacturer);
        System.out.println("страна происхождения: " + country);
        System.out.println("цена: " + price);
        System.out.println("состояние бронирования покупателем: " + booking);
        System.out.println(" ");
    }

    public static Product[] InitializeProducts() {
        return new Product[]{
                new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.",
                        "Korea", 55990, true),
                new Product("Apple iPhone 14 Pro Max", "01.09.2023", "Apple Inc.",
                        "USA", 120000, false),
                new Product("Samsung Galaxy S23 Ultra", "15.02.2023", "Samsung Corp.",
                        "Korea", 95000, true),
                new Product("Xiaomi Redmi Note 12", "10.01.2024", "Xiaomi Corporation",
                        "China", 28000, false),
                new Product("Sony WH-1000XM5", "20.07.2023", "Sony Corporation",
                        "Japan", 23338, true)
        };
    }
}
