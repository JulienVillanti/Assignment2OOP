package pkg1;

public class WheeledTransportation {
    private int numOfWheels;
    private double maxSpeed;
    private long serialNumber;
    private static long nextSerialNumber = 1;


    public WheeledTransportation() {
        //default constructor
        this.serialNumber = generateSerialNumber();
    }

    public WheeledTransportation(WheeledTransportation w1) {
        //copy constructor
        numOfWheels = w1.numOfWheels;
        maxSpeed = w1.maxSpeed;
        this.serialNumber = generateSerialNumber();
    }

    public WheeledTransportation(int nw, double ms) {
        //parameter constructor
        numOfWheels = nw;
        maxSpeed = ms;
        this.serialNumber = generateSerialNumber();
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "This is a wheeled transportation. " +
                "The number of wheels is " + numOfWheels +
                ". Its maximum speed is" + maxSpeed +
                " km/h. The serial number is " + serialNumber + ".";
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}