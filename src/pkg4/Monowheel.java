package pkg4;

import pkg1.WheeledTransportation;

public class Monowheel extends WheeledTransportation {

    private double maxWeight;

    private long serialNum;
    private static long nextSerialNumber = 55000;


public Monowheel(){
    maxWeight = 900;
    this.serialNum = generateSerialNumber();
}

public Monowheel(Monowheel mn1){
    maxWeight = mn1.maxWeight;
    setNumOfWheels(mn1.getNumOfWheels());
    setMaxSpeed(mn1.getMaxSpeed());
    serialNum = generateSerialNumber();
}

public Monowheel(int nw, double ms, int mxWeight){
super(nw, ms);
this.maxWeight = mxWeight;
this.serialNum = generateSerialNumber();

}

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public String toString() {
        return "Monowheel{" +
                "maxWeight=" + maxWeight +
                ", serialNum=" + serialNum +
                '}';
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}
