package data;

public class Engine {
    private int modelNo;

    private int maxPower;
    private int maxRPM;

    public Engine(int modelNo, int maxPower, int maxRPM) {
        this.modelNo = modelNo;
        this.maxPower = maxPower;
        this.maxRPM = maxRPM;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }
    public void display(){
        System.out.println("modelNo = " + modelNo);
        System.out.println("maxPower = " + maxPower);
        System.out.println("maxRPM = " + maxRPM);
    }
}
