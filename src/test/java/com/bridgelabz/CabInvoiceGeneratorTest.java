package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_ShouldReturn_TotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();//creating object of CabInvoiceGenerator class
        double distance = 5.5;
        int time = 10;
        double fare = cabInvoiceGenerator.calculateFare(distance, time);//Using object reference calling calculateFare method with parameters
        Assertions.assertEquals(65, fare);//Verifies that the expected and actual values are equal
    }
}
