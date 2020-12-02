package com.aclab.dne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DneApplication {
    private static final Logger log = LoggerFactory.getLogger(DneApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DneApplication.class, args);
        log.info("Application initialisée avec succés.");
    }

}
