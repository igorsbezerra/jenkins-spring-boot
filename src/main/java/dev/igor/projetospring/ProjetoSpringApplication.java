package dev.igor.projetospring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringApplication {
    public static final Logger logger = LoggerFactory.getLogger(ProjetoSpringApplication.class);

    public static void main(String[] args) {
        logger.info("Hello, World!");
        SpringApplication.run(ProjetoSpringApplication.class, args);
    }
}
