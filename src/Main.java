import WheeledTransportation.WheeledTransportation;
import WheeledTransportation.Train;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WheeledTransportation w1 = new WheeledTransportation(4, 250);
        Train t1 = new Train(10, 600, 25, "Paris","Berlin");
        Train t2 = new Train(20, 450, 34, "Montréal","New York");
        System.out.println(w1);
        System.out.println(t1);
        System.out.println(t2);

    }
}