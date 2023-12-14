import pkg1.WheeledTransportation;
import pkg2.Train;
import pkg2.Tram;
import pkg3.Metro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WheeledTransportation w1 = new WheeledTransportation(4, 250);
        Train t1 = new Train(10, 600, 25, "Paris", "Berlin");
        Train t2 = new Train(20, 450, 34, "Montréal", "New York");
        Train t3 = new Train(t1);
        Metro m1 = new Metro();
        Metro m2 = new Metro();
        Tram tr1 = new Tram(4,);
        System.out.println(w1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(tr1);


    }
}