package edu.neu.csye7374;

public interface Tradable1 extends Tradable {
    @Override
    default String getMetric() {
        return "Default metric from Tradable1";
    }
}
