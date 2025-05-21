package edu.neu.csye7374;

public class Driver {
    public static void main(String[] args) {
        StockMarket market = StockMarket.getInstance();

        System.out.println("Creating stocks...");
        Stock tech = new TechStock("TechCo", 150.0, "Innovative tech company");
        Stock energy = new EnergyStock("EnergyInc", 90.0, "Energy sector stock");
        Stock auto_mobile = new AutoStock("Tesla", 110.0, "Automated Driving Vehicles");
        Stock medical = new MedicalStock("CVS", 60.0, "Retail Medical Supplier");

        market.addStock(tech);
        market.addStock(energy);

        String[] bids = {"5.0", "3.5", "2.0", "-1.0", "0.5", "-0.5"};

        for (String bid : bids) {
            market.tradeStock("TechCo", bid);
        }

        System.out.println("\n");
        for (String bid : bids) {
            market.tradeStock("EnergyInc", bid);
        }

        for (String bid : bids) {
            market.tradeStock("Tesla", bid);
        }

        System.out.println("\n");
        for (String bid : bids) {
            market.tradeStock("CVS", bid);
        }

        market.showAllStocks();

        market.removeStock("TechCo");
        market.removeStock("Tesla");


        market.showAllStocks();
    }
}
