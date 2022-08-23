package derived;

import data.IcEngine;

public class Diesel extends IcEngine {
    public Diesel(int modelNo, int maxPower, int maxRPM, int displacement, int noOfCylender, String fuelType) {
        super(modelNo, maxPower, maxRPM, displacement, noOfCylender, fuelType);
    }
}
