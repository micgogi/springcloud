package com.rahul.limitservice.bean;

/**
 * @author Micgogi
 * on 1/30/2020  11:37 PM
 * Micgogi
 */
public class LimitConfiguration {
    private int maximum;
    private int minimum;
    public LimitConfiguration(){}
    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
