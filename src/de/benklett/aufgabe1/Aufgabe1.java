package de.benklett.aufgabe1;

public class Aufgabe1 {
    public static void run(String[] args) {
        String productName = args[0];
        double price = Double.parseDouble(args[1]);
        double gramms = Double.parseDouble(args[2]);
        double percentMwst = Double.parseDouble(args[3]);

        System.out.println(gramms / 1000 + "kg " + productName);
        System.out.println("für " + price / 100 + "€ pro Kilogramm");

        double calculatedPrice = calcPriceBanana(gramms, price / 100);

        System.out.printf("kosten %.3f€\n", calculatedPrice);
        System.out.printf("incl. %.3f€ MwSt\n", calcMwst(calculatedPrice, percentMwst));
    }

    static double calcMwst(double price, double mwst) {
        return price * (mwst / 100);
    }

    static double calcPriceBanana(double gramms, double costBananaPerKg) {
        return (gramms / 1000) * costBananaPerKg;
    }
}
