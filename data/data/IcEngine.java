package data;

public class IcEngine extends Engine {
    private int displacement;
    private int noOfCyllender;
    private String fuelType;

    public IcEngine(int modelNo, int maxPower, int maxRPM, int displacement, int noOfCyllender, String fuelType) {
        super(modelNo, maxPower, maxRPM);
        this.displacement = displacement;
        this.noOfCyllender = noOfCyllender;
        this.fuelType = fuelType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getNoOfCyllender() {
        return noOfCyllender;
    }

    public void setNoOfCyllender(int noOfCyllender) {
        this.noOfCyllender = noOfCyllender;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void display(){
        System.out.println("displacement = " + displacement);
        System.out.println("noOfCyllender = " + noOfCyllender);
        System.out.println("fuelType = " + fuelType);
    }
}
