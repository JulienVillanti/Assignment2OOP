import pkg1.WheeledTransportation;
import pkg2.Train;
import pkg3.Metro;
import pkg5.Aircraft;
import pkg5.Worldwar2plane;
import pkg6.Ferry;

public class Driver {
    public static void main(String[] args) {
        WheeledTransportation wt1 = new WheeledTransportation(5, 150);
        WheeledTransportation wt2 = new WheeledTransportation(5, 150);
        WheeledTransportation wt3 = new WheeledTransportation(10, 200);
        WheeledTransportation wt4 = new WheeledTransportation();
        WheeledTransportation wt5 = new WheeledTransportation(wt3);
        Train t1 = new Train(10, 25, 6, "Paris", "Berlin");
        Train t2 = new Train(10, 25, 6, "Montréal", "Toronto");
        Train t3 = new Train(50, 350, 35, "Paris", "Marseille");
        Train t4 = new Train(t3);
        Train t5 = new Train();
        Metro m1 = new Metro(20, 100, 10, "Berri-UQAM", "Sauvé", 10);
        Metro m2 = new Metro(40, 50, 20, "Toulouse", "Balma", 25);
        Metro m3 = new Metro(m1);
        Metro m4 = new Metro(50, 70, 25, "New-York", "Brooklyn", 30);
        Ferry f1 = new Ferry(80, 500);
        Ferry f2 = new Ferry(f1);
        Ferry f3 = new Ferry(100, 200);
        Ferry f4 = new Ferry();
        Ferry f5 = new Ferry(150, 100);
        Aircraft ac1 = new Aircraft(500000, 30000);
        Aircraft ac2 = new Aircraft(1000000, 50000);
        Aircraft ac3 = new Aircraft(ac1);
        Aircraft ac4 = new Aircraft(ac2);
        Aircraft ac5 = new Aircraft(750000, 40000);
        Worldwar2plane ww2 = new Worldwar2plane(3000000, 70000, true);
        Worldwar2plane ww1 = new Worldwar2plane(2000000, 30000, true);
        Worldwar2plane ww3 = new Worldwar2plane(250000, 10000, false);


        // Equality test
        boolean equalsTest = wt1.equals(t1);
        System.out.println("Equality test " + equalsTest);
        boolean equalsTest2 = t1.equals(t2);
        System.out.println("Equality test " + equalsTest2);


        System.out.println(m1);
        System.out.println(m3);
        System.out.println(ww2);


        Object[] mixedArray1 = {
                wt1, wt2, t1, t2, ac1, ww1, wt3, ww3, ac4, ac5, m1, m2, t3, m4, f4};

        Object[] mixedArray2 = {
                wt1, wt2, t1, t2, t3, f1, wt3, wt5, m3, m1, m1, m2, t3, m4, f4, f5, f2, f3};

        // Call findLeastAndMostExpensiveAircraft method
        findLeastAndMostExpensiveAircraft(mixedArray1);
        findLeastAndMostExpensiveAircraft(mixedArray2);
    }

    public static void findLeastAndMostExpensiveAircraft(Object[] mixedArray) {
        double leastExpensivePrice = Double.MAX_VALUE;
        double mostExpensivePrice = Double.MIN_VALUE;
        Aircraft leastExpensiveAircraft = null;
        Aircraft mostExpensiveAircraft = null;

        for (Object obj : mixedArray) {
            if (obj instanceof Aircraft) {
                Aircraft aircraft = (Aircraft) obj;
                double price = aircraft.getPrice();

                if (price < leastExpensivePrice) {
                    leastExpensivePrice = price;
                    leastExpensiveAircraft = aircraft;
                }

                if (price > mostExpensivePrice) {
                    mostExpensivePrice = price;
                    mostExpensiveAircraft = aircraft;
                }
            }
        }

        if (leastExpensiveAircraft != null && mostExpensiveAircraft != null) {
            System.out.println("The least expensive aircraft in the list is the following:");
            System.out.println(leastExpensiveAircraft);
            System.out.println("The most expensive aircraft in the list is the following:");
            System.out.println(mostExpensiveAircraft);
        } else {
            System.out.println("There is no aircraft found in the list.");
        }
    }
}


