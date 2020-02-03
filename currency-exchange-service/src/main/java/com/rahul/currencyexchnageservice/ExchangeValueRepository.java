package com.rahul.currencyexchnageservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Micgogi
 * on 2/3/2020  10:55 PM
 * Micgogi
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
