package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye7374.Stock;

public class AutoStock extends Stock{
    private List<Double> bids = new ArrayList<>();

    public AutoStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
            bids.add(Double.parseDouble(bid));
            price += Math.sin(Double.parseDouble(bid)) * 2;
    }

    @Override
    public String getMetric() {
        return String.format("Auto Performance Index: %.2f",
            bids.stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
    }
}
    

