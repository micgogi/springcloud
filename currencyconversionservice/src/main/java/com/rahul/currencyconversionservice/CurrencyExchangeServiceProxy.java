package com.rahul.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Micgogi
 * on 2/4/2020  10:30 PM
 * Micgogi
 */
@FeignClient(name="currency-exchange-service",url="localhost:8000")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/current-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchnageValue(@PathVariable("from") String from, @PathVariable("to") String to);


    }
