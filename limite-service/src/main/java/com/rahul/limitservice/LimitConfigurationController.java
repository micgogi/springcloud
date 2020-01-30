package com.rahul.limitservice;

import com.rahul.limitservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Micgogi
 * on 1/30/2020  11:35 PM
 * Micgogi
 */
@RestController
public class LimitConfigurationController {
    @Autowired Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return  new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
