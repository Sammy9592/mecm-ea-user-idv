package com.sl.mecm.user.service.idv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration
public class UserIDVApplication {

    private static final Logger logger = LoggerFactory.getLogger(UserIDVApplication.class);

    public static void main(String[] args) {
        try {
            logger.debug("start application debug");
            logger.info("start application info");
            logger.error("start application error");
            SpringApplication.run(UserIDVApplication.class, args);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
