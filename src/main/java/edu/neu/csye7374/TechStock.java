package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class TechStock extends Stock {
    private List<Double> bids = new ArrayList<>();

    public TechStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double b = Double.parseDouble(bid);
        bids.add(b);
        price = price * (1 + b / 100); // e.g.,：+5% → price * 1.05
    }

    @Override
    public String getMetric() {
        return String.format("Tech Performance Index: %.2f",
            bids.stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
    }
}
