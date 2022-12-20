package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CabInvoiceGeneratorTest {

    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();//creating object of CabInvoiceGenerator class

    @Test
    public void givenDistanceAndTime_ShouldReturn_TotalFare() {
        double distance = 5.5;
        int time = 10;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);//Using object reference calling calculateFare method with parameters
        Assertions.assertEquals(65, fare);//Verifies that the expected and actual values are equal
    }

    //calculate minimum fare using distance and time
    @Test
    public void givenMinDistanceAndTime_ShouldReturn_MinFare() {
        double distance = 1.5;
        int time = 5;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);//Using object reference calling calculateFare method with parameters
        Assertions.assertEquals(20, fare);//Verifies that the expected and actual values are equal
    }

    @Test
    public void givenMultipleRides_ShouldReturn_TotalInvoice() {
        Ride[] rides = {
                new Ride(4.5, 10),
                new Ride(5.5, 10)
        };
        Invoice invoice = cabInvoiceGenerator.calculateFare(rides);//using object calling calculateFare method
        Invoice expectedInvoice = new Invoice(2, 120.0);//invoice store in expectedInvoice
        Assertions.assertEquals(invoice, expectedInvoice);
    }

    @Test
    public void givenUserId_ShouldReturn_Invoice() {
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(3.1, 5)
        };
        cabInvoiceGenerator.rideRepository.put("User01", Arrays.asList(rides));
        Invoice invoice = cabInvoiceGenerator.calculateFare("User01");
        Invoice expectedInvoice = new Invoice(2, 61.0);
        Assertions.assertEquals(invoice, expectedInvoice);
    }
}
