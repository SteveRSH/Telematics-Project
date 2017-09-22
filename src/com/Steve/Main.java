package com.Steve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // to import java.util.Scanner without typing it, click on Scanner press alt and enter
        Scanner in = new Scanner(System.in);

        // make a new VehicleInfo object

        VehicleInfo vh = new VehicleInfo();

// The below vh is no longer needed. The user will enter their info in the console.
//        vh.setVIN(88888);
//        vh.setConsumption(99999);
//        vh.setEngineSize(67890);
//        vh.setOdometer(24680);
//        vh.setOdometerReading(36912);



        System.out.println("Please provide the VIN number:");
        vh.setVIN(Integer.parseInt(in.nextLine()));

        System.out.println("Please provide the Consumption number:");
        vh.setConsumption(Double.parseDouble(in.nextLine()));

        System.out.println("Please provide the Engine size:");
        vh.setEngineSize(Double.parseDouble(in.nextLine()));

        System.out.println("Please provide the Odometer number:");
        vh.setOdometer(Double.parseDouble(in.nextLine()));

        System.out.println("Please provide the Odometer Reading:");
        vh.setOdometerReading(Double.parseDouble(in.nextLine()));




        //for each field in VehicleInfo, use the
        // scanner to read in values, and populate
        // the object.

        TelematicsService.report(vh);
    }
}






