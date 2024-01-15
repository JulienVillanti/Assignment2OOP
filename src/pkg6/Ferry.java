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

        // Convert the object to a Ferry instance
        Ferry other = (Ferry) obj;

        // Compare the values of the fields (except serialNumber)
        return Double.compare(other.maximumSpeed, maximumSpeed) == 0 &&
                Double.compare(other.maxLoad, maxLoad) == 0;
    }

    @Override
    public String toString() {
        return "This ferry, serialNumber " + serialNumber + "- has a maximumSpeed of " + maximumSpeed + " km/h. " +
                "It has a maxLoad of " + maxLoad + "kgs.";
    }
}


