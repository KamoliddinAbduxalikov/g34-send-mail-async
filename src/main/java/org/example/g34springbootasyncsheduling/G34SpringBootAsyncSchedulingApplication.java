package org.example.g34springbootasyncsheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class G34SpringBootAsyncSchedulingApplication {
    public static void main(String[] args) {
        SpringApplication.run(G34SpringBootAsyncSchedulingApplication.class, args);
    }
}
