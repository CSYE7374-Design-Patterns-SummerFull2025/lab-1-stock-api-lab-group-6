package edu.neu.csye7374;

public interface Tradable0 extends Tradable {
    default void setBid(String bid) {
        System.out.println("Default setBid: " + bid);
    }

    @Override
    default String getMetric() {
        return "Default metric from Tradable0";
    }
}