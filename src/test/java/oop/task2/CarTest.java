package oop.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    Truck myTruck = new Truck(100,1000.0,"Blue", 2000);

    @Test
    public void getSalePriceTruckTest2000() {
        Assertions.assertEquals(800, myTruck.getSalePrice());
    }
}
