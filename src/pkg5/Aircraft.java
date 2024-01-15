package pkg5;

public class Aircraft {
    private double price;
    private double maxElevation;
    private long serialNum;
    private static long nextSerialNumber = 90000;

    public Aircraft() {
        price = 1000000;
        maxElevation = 30000;
        serialNum = generateSerialNumber();
    }


    public Aircraft(Aircraft a1) {
        price = a1.price;
        maxElevation = a1.maxElevation;
        this.serialNum = generateSerialNumber();
    }

    public Aircraft(double pr, double mel) {
        price = pr;
        maxElevation = mel;
        this.serialNum = generateSerialNumber();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxElevation() {
        return maxElevation;
    }

    public void setMaxElevation(double maxElevation) {
        this.maxElevation = maxElevation;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
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

        // Convert the object to an Aircraft instance
        Aircraft other = (Aircraft) obj;

        // Compare the values of the fields
        return Double.compare(other.price, price) == 0 &&
                Double.compare(other.maxElevation, maxElevation) == 0;
    }

    @Override
    public String toString() {
        return "This aircraft has a price 0f " + price + "$. Its max elevation during flight is " + maxElevation + " and its serial number is " + serialNum + ".";
    }


    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}
