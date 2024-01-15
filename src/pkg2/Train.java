package pkg2;

import pkg1.WheeledTransportation;

public class Train extends WheeledTransportation {
    private int numOfVehicles;
    private String startingPoint;
    private String destinationStation;
    private long serialNum;
    private static long nextSerialNumber = 10000;


    public Train() {
        this.serialNum = generateSerialNumber();

    }

    public Train(Train t1) {
        numOfVehicles = t1.numOfVehicles;
        setNumOfWheels(t1.getNumOfWheels());
        setMaxSpeed(t1.getMaxSpeed());
        startingPoint = t1.startingPoint;
        destinationStation = t1.destinationStation;
        this.serialNum = generateSerialNumber();


    }

    public Train(int nw, double ms, int numOfVehicles, String startingPoint, String destinationStation) {
        super(nw, ms);
        this.numOfVehicles = numOfVehicles;
        this.startingPoint = startingPoint;
        this.destinationStation = destinationStation;
        this.serialNum = generateSerialNumber();
    }

    public int getNumOfVehicles() {
        return numOfVehicles;
    }

    public void setNumOfVehicles(int numOfVehicles) {
        this.numOfVehicles = numOfVehicles;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public static long getNextSerialNumber() {
        return nextSerialNumber;
    }

    public static void setNextSerialNumber(long nextSerialNumber) {
        Train.nextSerialNumber = nextSerialNumber;
    }


    @Override
    public boolean equals(Object obj) {
        // Check if the object is the same reference
        if (this == obj) {
            return true;
        }

        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Call the superclass's equals method
        if (!super.equals(obj)) {
            return false;
        }

        // Convert the object to a Train instance
        Train other = (Train) obj;

        // Compare the values of the fields (except serialNum)
        return numOfVehicles == other.numOfVehicles &&
                startingPoint.equals(other.startingPoint) &&
                destinationStation.equals(other.destinationStation);
    }

    @Override
    public String toString() {
        return "This train has " + numOfVehicles + " cars. Its maximum speed is " + getMaxSpeed() + " km/h and the serial number is " + serialNum + ". The starting destination is " + startingPoint + " and it arrives in " + destinationStation + ".";

    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }

}
