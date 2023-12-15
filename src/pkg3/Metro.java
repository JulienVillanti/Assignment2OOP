package pkg3;

import pkg2.Train;

public class Metro extends Train {
    private int totalNumOfStops;
    private long serialNum;
    private static long nextSerialNumber = 25000;


public Metro(){
    this.serialNum = generateSerialNumber();
}

public Metro(Metro m1){
    totalNumOfStops = m1.totalNumOfStops;
    setNumOfWheels(m1.getNumOfWheels());
    setMaxSpeed(m1.getMaxSpeed());
    setNumOfVehicles(m1.getNumOfVehicles());
    setStartingPoint(m1.getStartingPoint());
    setDestinationStation(m1.getDestinationStation());
    this.serialNum = generateSerialNumber();
}

public Metro(int nw, double ms, int numOfVehicles, String startingPoint, String destinationStation, int numStops){
    super(nw, ms, numOfVehicles, startingPoint, destinationStation);
    this.totalNumOfStops = numStops;
    this.serialNum = generateSerialNumber();
}


    public int getTotalNumOfStops() {
        return totalNumOfStops;
    }

    public void setTotalNumOfStops(int totalNumOfStops) {
        this.totalNumOfStops = totalNumOfStops;
    }

    @Override
    public String toString() {
        return "Metro{" +
                "totalNumOfStops=" + totalNumOfStops +
                ", serialNum=" + serialNum +
                '}';
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}
