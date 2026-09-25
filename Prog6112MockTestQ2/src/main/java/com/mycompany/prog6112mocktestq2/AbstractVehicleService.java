package com.mycompany.prog6112mocktestq2;

public abstract class AbstractVehicleService implements VehicleService {

    private String customerName;
    private double partsCost;

    public AbstractVehicleService(String customerName, double partsCost) {
        this.customerName = customerName;
        this.partsCost = partsCost;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public double getPartsCost() {
        return partsCost;
    }

    @Override
    public double getLabourCharge() {
        return partsCost * 0.25;
    }
}