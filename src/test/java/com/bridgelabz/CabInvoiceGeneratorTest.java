package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();//creating object of CabInvoiceGenerator class

    @Test
    public void givenDistanceAndTime_ShouldReturn_TotalFare() {
        double distance = 5.5;
        int time = 10;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);//Using object reference calling calculateFare method with parameters
        Assertions.assertEquals(65, fare);//Verifies that the expected and actual values are equal
    }

    //calculate minimum fare
    @Test
    public void givenMinDistanceAndTime_ShouldReturn_MinFare() {
        double distance = 1.5;
        int time = 5;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);//Using object reference calling calculateFare method with parameters
        Assertions.assertEquals(20, fare);//Verifies that the expected and actual values are equal
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalFare() {//Total fare for multiple rides
        Ride[] rides = {
                new Ride(4.5, 10),
                new Ride(5.5, 10)
        };
        double totalFare = cabInvoiceGenerator.calculateFare(rides);////Using object reference calling calculateFare method with rides
        Assertions.assertEquals(120.0, totalFare);//Verifies that the expected and actual values are equal
    }
}
