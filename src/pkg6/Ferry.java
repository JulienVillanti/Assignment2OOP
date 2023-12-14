package pkg6;

public class Ferry {
    private double maximumSpeed;
    private double maxLoad;
    private long serialNumber;

    private static long nextSerialnumber = 70000;

    public Ferry() {
        maximumSpeed = 100;
        maxLoad = 2;
        this.serialNumber = generateSerialNumber();
    }

    public Ferry(Ferry f1) {
        maximumSpeed = f1.maximumSpeed;
        maxLoad = f1.maxLoad;
        this.serialNumber = generateSerialNumber();
    }

    public Ferry(double maxSpeed, double ml) {
        maximumSpeed = maxSpeed;
        maxLoad = ml;
        this.serialNumber = generateSerialNumber();
    }

    private static long generateSerialNumber() {
        return nextSerialnumber++;
    }
}
