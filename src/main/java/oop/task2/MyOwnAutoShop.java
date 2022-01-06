package oop.task2;

public class MyOwnAutoShop {
    //Testing classes Sedan, Car, Ford with this main method
    public static void main(String[] args) {
        Sedan mySedan = new Sedan(160,20000,"Red",10);
        Ford myFord1 = new Ford(156, 4452.0,"Black",2005,10);
        Ford myFord2 = new Ford(155, 5000.0,"Pink",1998,5);
        Car myCar = new Car(555,56856.0,"Red");

        System.out.printf("MySedan Price %.2f \n", mySedan.getSalePrice());
        System.out.printf("MyFord1 Price %.2f \n", myFord1.getSalePrice());
        System.out.printf("MyFord2 Price %.2f \n", myFord2.getSalePrice());
        System.out.printf("MyCar Price %.2f", myCar.getSalePrice());
    }
}
