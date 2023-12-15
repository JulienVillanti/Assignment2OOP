package pkg5;

public class Worldwar2plane extends Aircraft{

    boolean hasTwinEngine;
    private long serialNum;
    private static long nextSerialNumber = 80000;


    public Worldwar2plane(){
        hasTwinEngine = true;
        this.serialNum = generateSerialNumber();
    }

    public Worldwar2plane(Worldwar2plane ww1){
        hasTwinEngine = ww1.hasTwinEngine;
        setPrice(ww1.getPrice());
        setMaxElevation(ww1.getMaxElevation());
        this.serialNum = generateSerialNumber();

    }

    public Worldwar2plane(double pr, double mel, boolean hasTwinEng){
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
    public String toString() {
        return "Worldwar2plane{" +
                "hasTwinEngine=" + hasTwinEngine +
                ", serialNum=" + serialNum +
                '}';
    }

    private static long generateSerialNumber() {
        return nextSerialNumber++;
    }
}
