package com.rahul.currencyexchnageservice;

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
    @GetMapping("/current-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchnageValue(@PathVariable String from, @PathVariable String to){
        return new ExchangeValue(1000L,from , to, BigDecimal.valueOf(65));
    }
}
