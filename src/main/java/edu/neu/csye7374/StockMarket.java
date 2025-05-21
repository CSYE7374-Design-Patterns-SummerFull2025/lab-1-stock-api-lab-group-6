package edu.neu.csye7374;

import java.util.HashMap;
import java.util.Map;

public class StockMarket {
    private static StockMarket instance;

    private Map<String, Stock> stocks = new HashMap<>();

    private StockMarket() {}

    // create only access
    public static StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    // add stock
    public void addStock(Stock stock) {
    	System.out.println("Add stock:"+stock);
        stocks.put(stock.name, stock);
    }

    // remove stock
    public void removeStock(String name) {
        if (stocks.containsKey(name)) {
            System.out.println("Removing stock: " + name);
            stocks.remove(name);
        } else {
            System.out.println("Stock not found: " + name);
        }
    }

    // trade stock
    public void tradeStock(String name, String bid) {
        Stock stock = stocks.get(name);
        if (stock != null) {
            System.out.println("→ Bidding " + bid + " on " + name);
            stock.setBid(bid);
        }
    }

    // get all stock information
    public void showAllStocks() {
        System.out.println("\nGet all stocks in market:");
        for (Stock stock : stocks.values()) {
            System.out.println(stock);
            System.out.println("Metric: " + stock.getMetric());
        }
    }
}
