package pkg5;

public class Worldwar2plane extends Aircraft {

    boolean hasTwinEngine;
    private long serialNum;
    private static long nextSerialNumber = 80000;


    public Worldwar2plane() {
        hasTwinEngine = true;
        this.serialNum = generateSerialNumber();
    }

    public Worldwar2plane(Worldwar2plane ww1) {
        hasTwinEngine = ww1.hasTwinEngine;
        setPrice(ww1.getPrice());
        setMaxElevation(ww1.getMaxElevation());
        this.serialNum = generateSerialNumber();

    }

    public Worldwar2plane(double pr, double mel, boolean hasTwinEng) {
        super(pr, mel);
        this.hasTwinEngine = hasTwinEng;
        this.serialNum = generateSerialNumber();
    }

    public boolean isHasTwinEngine() {
        return hasTwinEngine;
    }

    public void setHasTwinEngine(boolean hasTwinEngine) {
        this.hasTwinEngine = hasTwinEngine;
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    @Override
    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Call the superclass's equals method
        if (!super.equals(obj)) {
            return false;
        }

        Worldwar2plane other = (Worldwar2plane) obj;
        return hasTwinEngine == other.hasTwinEngine;
    }

    @Override
    public String toString() {
        String engineType = hasTwinEngine ? "twin-engine" : "single-engine";

        return "This World War 2 airplane has an engine type of: " + engineType + ". Its serial number is " + serialNum + "." +
                " The price of this airplane is " + getPrice() + " and its maximum elevation is " + getMaxElevation() + ".";
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}
