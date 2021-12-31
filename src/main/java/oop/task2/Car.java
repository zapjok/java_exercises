package oop.task2;

public class Car {
    private int speed;
    double regularPrice;
    String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return regularPrice;
    }
}

class Truck extends Car {

    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        return this.weight > 2000 ? regularPrice * 0.9 : regularPrice * 0.8;
    }
}

class Ford extends Car {

    private int year,manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return (regularPrice - (regularPrice * ((double)manufacturerDiscount) / 100.0));
    }
}

class Sedan extends Car {

    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        return length > 20 ? regularPrice * 0.95 : regularPrice * 0.90;
    }
}
