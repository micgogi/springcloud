package com.rahul.currencyexchnageservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;

/**
 * @author Micgogi
 * on 2/3/2020  9:29 PM
 * Micgogi
 */
@RestController
public class CurrencyExchangeController {
    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeValueRepository exchangeValueRepository;
    @GetMapping("/current-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchnageValue(@PathVariable String from, @PathVariable String to){


        ExchangeValue exchangeValue=new ExchangeValue(1000L,from , to, BigDecimal.valueOf(65));

        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
