package com.mycompany.prog6112mocktestq2;

public class RunApplication {

    public static void main(String[] args) {

        VehicleServiceReport report =
                new VehicleServiceReport("John Smith", 5000);

        report.printReport();
    }
}