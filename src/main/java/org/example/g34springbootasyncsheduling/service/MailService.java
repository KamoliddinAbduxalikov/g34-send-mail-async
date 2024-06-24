package org.example.g34springbootasyncsheduling.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MailService {

    @SneakyThrows
    @Async(value = "asyncExecutor")
    public void sendMail(String to, String subject, String content) {
        log.info("send mail to " + to);
        Thread.sleep(10000);
        log.info("send mail subject " + subject);
    }
}
