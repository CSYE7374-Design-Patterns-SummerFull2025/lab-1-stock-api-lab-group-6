package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class EnergyStock extends Stock {
    private List<Double> bids = new ArrayList<>();

    public EnergyStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double b = Double.parseDouble(bid);
        bids.add(b);
        price += (b - 1.0); // e.g., bid 为 2 → +1
    }

    @Override
    public String getMetric() {
        return String.format("Energy Efficiency Index: %.2f",
            bids.stream().mapToDouble(d -> d - 1.0).sum());
    }
}
