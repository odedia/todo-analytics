package com.thehecklers.scstsink;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ScstSinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScstSinkApplication.class, args);
    }

}

@Configuration
class CoffeeDrinker {
    @Bean
    Consumer<String> whatIsDone() {
        return System.out::println;
    }
}

