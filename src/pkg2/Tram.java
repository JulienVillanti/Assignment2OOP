package pkg2;

import pkg3.Metro;

public class Tram extends Metro {
    private int yearOfCreation;
    private long serialNum;
    private static long nextSerialNumber = 30000;

    public Tram() {
        this.yearOfCreation = 1988;
        this.serialNum = generateSerialNumber();

    }

    public Tram(Tram tr1) {
        //copy constructor
        yearOfCreation = tr1.yearOfCreation;
        setNumOfWheels(tr1.getNumOfWheels());
        setMaxSpeed(tr1.getMaxSpeed());
        setNumOfVehicles(tr1.getNumOfVehicles());
        setStartingPoint(tr1.getStartingPoint());
        setDestinationStation(tr1.getDestinationStation());
        setTotalNumOfStops(tr1.getTotalNumOfStops());
        this.serialNum = generateSerialNumber();
    }

    public Tram(int nw, double ms, int numOfVehicles, String startingPoint, String destinationStation, int numStops, int yearCreation){
        super(nw, ms, numOfVehicles, startingPoint, destinationStation, numStops);
        this.yearOfCreation = yearCreation;
        this.serialNum = generateSerialNumber();
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

   //Do you add getter and setter for serial num(for all class??)


    @Override
    public String toString() {
        return "Tram{" +
                "yearOfCreation=" + yearOfCreation +
                ", serialNum=" + serialNum +
                '}';
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }

}