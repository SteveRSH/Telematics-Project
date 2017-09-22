package com.Steve;

public class VehicleInfo {


//Write a VehicleInfo class that has the following information (fields):
    //    VIN (Vehicle Identification Number) - int    -DONE
    //    odometer (miles traveled) - double           -DONE
    //    consumption (gallons of gas consumed) - double  -DONE
    //    odometer reading for last oil change - double   -DONE
    //    engine size in liters (e.g. 2.0, 4.5) - double  -DONE

    private int VIN;
    private double odometer;
    private double consumption;
    private double odometerReading;
    private double engineSize;

//The VehicleInfo class should be a JavaBean which means it has an empty constructor (COMMAND + N) - DONE

//No argument constructor - No arguments are passed *****
    // If more than one argument is submitted, the code breaks.
    public VehicleInfo() {

    }
//multi argument constructor - Five arguments are passed *******
    // If more than five arguments is submitted, the code breaks.
    public VehicleInfo(int VIN,
                       double odometer,
                       double consumption,
                       double odometerReading,
                       double engineSize) {

        this.VIN = VIN;
        this.odometer = odometer;
        this.consumption = consumption;
        this.odometerReading = odometerReading;
        this.engineSize = engineSize;
    }

// The VehicleInfo class should be a JavaBean which means it has
// a get/set methods for all the variables. (COMMAND + N) - DONE

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(double odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}


