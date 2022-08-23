package data;

public class ElectricEngine extends Engine {
    private int voltage;

    public ElectricEngine(int modelNo, int maxPower, int maxRPM, int voltage) {
        super(modelNo, maxPower, maxRPM);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }
    public void display(){
        System.out.println("voltage = " + voltage);
    }
}