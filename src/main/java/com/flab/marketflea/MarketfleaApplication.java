package com.flab.marketflea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MarketfleaApplication {

    public static void main(String[] args) {

        SpringApplication.run(MarketfleaApplication.class, args);
    }

}
