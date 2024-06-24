package org.example.g34springbootasyncsheduling.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class Scheduling {

    //@Scheduled(fixedRate = 5000, initialDelay = 5000, timeUnit = TimeUnit.MICROSECONDS)
    @Scheduled(cron = "* * * * * *")
    public void scheduledTask() {
        System.out.println(LocalDateTime.now() + "scheduledTask");
    }
}
