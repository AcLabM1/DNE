package com.aclab.dne;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DneApplication {
    private static final Logger LOG = LoggerFactory.getLogger(DneApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(DneApplication.class, args);
        LOG.info("Application initialisée avec succés.");
    }
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}
