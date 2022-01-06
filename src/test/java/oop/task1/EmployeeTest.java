package oop.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
    Employee johnSnow = new Employee("John", "Snow", 1000.0);
    @Test
    public void employeeInitialization() {
        Assertions.assertEquals("John",johnSnow.getFirstName());
        Assertions.assertEquals("Snow",johnSnow.getLastName());
        Assertions.assertEquals(1000.0,johnSnow.getSalary());
    }
    @Test
    public void firstNameSetGet() {
        johnSnow.setFirstName("Tyrion");
        Assertions.assertEquals("Tyrion",johnSnow.getFirstName());
    }
    @Test
    public void lastNameSetGet() {
        johnSnow.setLastName("Lanister");
        Assertions.assertEquals("Lanister",johnSnow.getLastName());
    }
    @Test
    public void salarySetGet() {
        johnSnow.setSalary(3333.3);
        Assertions.assertEquals(3333.3,johnSnow.getSalary());
    }
    @Test
    public void salarySetGetNegative() {
        johnSnow.setSalary(-3333.3);
        Assertions.assertEquals(0.0,johnSnow.getSalary());
    }
}
