package com.mycompany.prog6112mocktestq2;

public class VehicleServiceReport extends AbstractVehicleService {

    public VehicleServiceReport(String customerName, double partsCost) {
        super(customerName, partsCost);
    }

    public void printReport() {
        System.out.println("VEHICLE SERVICE REPORT");
        System.out.println("----------------------------");
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Parts Cost: R" + getPartsCost());
        System.out.println("Labour Charge: R" + getLabourCharge());
    }
}