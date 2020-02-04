package com.rahul.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 2/4/2020  9:29 PM
 * Micgogi
 */
@RestController
public class CurrencyConversionController {
    @Autowired
    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to ,
                                                  @PathVariable BigDecimal quantity){


        CurrencyConversionBean currencyConversionBean=currencyExchangeServiceProxy.retrieveExchnageValue(from,to);
        return new CurrencyConversionBean(currencyConversionBean.getId(),from,to,
                currencyConversionBean.getConversionMultiple(),quantity,quantity.multiply(currencyConversionBean.getConversionMultiple()),currencyConversionBean.getPort());

    }

    @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to ,
                                                  @PathVariable BigDecimal quantity){


        CurrencyConversionBean currencyConversionBean=currencyExchangeServiceProxy.retrieveExchnageValue(from,to);
        return new CurrencyConversionBean(currencyConversionBean.getId(),from,to,
                currencyConversionBean.getConversionMultiple(),quantity,quantity.multiply(currencyConversionBean.getConversionMultiple()),currencyConversionBean.getPort());

    }
}
