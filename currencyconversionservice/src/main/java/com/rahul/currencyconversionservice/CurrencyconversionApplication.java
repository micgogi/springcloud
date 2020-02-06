package com.rahul.currencyconversionservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.rahul.currencyconversionservice")
public class CurrencyconversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconversionApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
