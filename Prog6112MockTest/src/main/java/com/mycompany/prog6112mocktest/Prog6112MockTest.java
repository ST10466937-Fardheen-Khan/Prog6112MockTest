package com.mycompany.prog6112mocktest;

public class Prog6112MockTest {

    public static void main(String[] args) {

        // 1D array for destination names
        String[] destinations = {
            "Cape Town",
            "Durban",
            "Mpumalanga"
        };

        // 2D array for the two values
        int[][] values = {
            {12800, 9500},
            {10200, 8400},
            {14800, 11100}
        };

        int greatestDifference = 0;
        String greatestDestination = "";

        System.out.println("HOLIDAY PACKAGE COST REPORT");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-12s %-12s %-12s%n",
                "Item", "Value 1 (R)", "Value 2 (R)", "Difference");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < destinations.length; i++) {

            int difference = values[i][0] - values[i][1];

            String stars = "";

            if (difference >= 3000) {
                stars = "***";
            }

            if (difference > greatestDifference) {
                greatestDifference = difference;
                greatestDestination = destinations[i];
            }

            System.out.printf("%-15s %-12d %-12d %-12d %s%n",
                    destinations[i],
                    values[i][0],
                    values[i][1],
                    difference,
                    stars);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Destination with greatest difference: "
                + greatestDestination);
        System.out.println("Greatest difference: R" + greatestDifference);
    }
}