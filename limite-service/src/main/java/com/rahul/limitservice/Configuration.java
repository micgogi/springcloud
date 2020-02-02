package com.rahul.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Micgogi
 * on 1/30/2020  11:55 PM
 * Micgogi
 */
@Component
@ConfigurationProperties("limit-service")
public class Configuration {
    private int minimum;
    private int maximum;
    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
