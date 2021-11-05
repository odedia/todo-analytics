package com.thehecklers.scstsink;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class TodoAnalyticsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAnalyticsApplication.class, args);
    }

}

@Configuration
class CoffeeDrinker {
    @Bean
    Consumer<String> input() {
        return System.out::println;
    }

    @Bean
    public HttpTraceRepository htttpTraceRepository() {
            return new InMemoryHttpTraceRepository();
    }
}

