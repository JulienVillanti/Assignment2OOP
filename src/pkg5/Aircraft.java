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
    public String toString() {
        return "Aircraft{" +
                "price=" + price +
                ", maxElevation=" + maxElevation +
                ", serialNum=" + serialNum +
                '}';
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}
