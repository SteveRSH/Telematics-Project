package com.Steve;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//Put notes to the bottom of the screen

//Note 1

public class TelematicsService {

//Note 2



    static void report(VehicleInfo vehicleInfo){

//Note 3


        File f = new File(vehicleInfo.getVIN() + ".json");
        try {

            FileWriter fw = new FileWriter(f);

//Note 4


            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(vehicleInfo);

            fw.write(json);
            fw.close();

//Note 5

            ArrayList<VehicleInfo> vehicleInfos = new ArrayList<>();

            double scannedOdometer = 0;
            double scannedConsumption = 0;
            double scannedOilChange = 0;
            double scannedEngineSize = 0;


            // read from all json files
            File file = new File(".");
            for (File currentFile : file.listFiles()) {
                if (currentFile.getName().endsWith(".json")) {

                    // GET THE Json FROM THE FILE
                    String fileJson = getDataFromFile(currentFile);

                    // Convert that json to a VehicleInfo Object
                    ObjectMapper om = new ObjectMapper();
                    VehicleInfo vi = om.readValue(fileJson, VehicleInfo.class);


                    // what do we do with vi?

                    vehicleInfos.add(vi);

                    // put it inside of an arraylist. Write the code here for the info from
                    // Json to go into the array list



                    for (int i = 0; i < vehicleInfos.size(); i++) {
                        scannedOdometer += vehicleInfos.get(i).getOdometer();
                        scannedConsumption += vehicleInfos.get(i).getConsumption();
                        scannedOilChange += vehicleInfos.get(i).getOdometerReading();
                        scannedEngineSize += vehicleInfos.get(i).getEngineSize();
                    }


                }
            }

            System.out.println("Test Odometer:" + scannedOdometer);
            System.out.println("Test average is :" + (scannedOdometer / vehicleInfos.size()));

            System.out.println("Test consumption:" + scannedConsumption);
            System.out.println("Test average is :" + (scannedConsumption/vehicleInfos.size()));

            System.out.println("Test Oil change:" + scannedOilChange);
            System.out.println("Test average is :" + (scannedOilChange/vehicleInfos.size()));

            System.out.println("Test engine size:" + scannedEngineSize);
            System.out.println("Test average is :" + (scannedEngineSize/vehicleInfos.size()));


            // when we get to this point, we should have a populated arraylist of VehicleInfos

            // we can use this list to write values to our html



//{"odometer":0.0,"consumption":0.0,"odometerReading":0.0,"engineSize":0.0,"vin":12345}

//            fw.write("shennanigans");  *** WORKS NO LONGER NEEDED
//            fw.close();                *** WORKS NO LONGER NEEDED


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static String getDataFromFile (File f) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(f);

        String results = "";
        String scanned =fileScanner.nextLine();
        results += scanned;
        // use the filescanner to get the next line of input from the file
        // set that value to the results variable

        // while fileScanner hasNext(),
        // add the next line from the file
        // to results

        return results;
    }

    // TODO: maybe write a "writeDataToFile method??????"
}


//Note 1:
// Write a TelematicsService class and implement the following method:

//Note 2:
// void report(VehicleInfo vehicleInfo) OR static void report(VehicleInfo vehicleInfo)
///////////   WHY static void report ..... VERSUS void report
///////////////////   Ans: static method belongs to the class.
/////////////////////// A non-static method, on the other hand, belongs to an object of a class

//Note 3:
//Write the VehicleInfo to a file as json
// using the VIN as the name of the file and
// a "json" extension (e.g. "234235435.json").
// The file will overwrite any existing files for the same VIN.  --DONE

//////////////////NOTE////////////////////////////////////////
//File f (java object) is creating a new File
// and that file is getting the VIN info from the vehicleInfo.

//Note 4:
//// convert our vehicleInfo to json
//ObjectMapper class provides functionalities to convert
// Java objects to matching JSON constructs and vice versa.

//Note 5:
// GOAL: Build an arraylist of VehicleInfo objects
// we'll get our vehicle info info from all the json files
// in the current directory


/////////////////////////
//while fileScanner hasNext(),
//add the next line from the file
//to results

//Notes:
//Class − A class can be defined as a template/blueprint that describes the
// behavior/state that the object of its type support.