package org.example.g34springbootasyncsheduling.service;

import org.example.g34springbootasyncsheduling.dto.UserCreationDTO;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class AuthService {

    private final MailService mailService;

    private final ExecutorService executorService;

    public AuthService(MailService mailService) {
        this.mailService = mailService;
        this.executorService = Executors.newFixedThreadPool(4);
    }

    public void register(UserCreationDTO dto) {

//        Thread thread = new Thread(
//                () -> mailService.sendMail(dto.email(), "Register", "AUTHENTICATION CODE")
//        );
//        thread.start();

//        executorService.execute(() -> mailService.sendMail(
//                dto.email(), "Register", "AUTHENTICATION CODE")
//        );
//
//        CompletableFuture.runAsync(() ->
//                mailService.sendMail(
//                        dto.email(),
//                        "Register",
//                        "AUTHENTICATION CODE"));
        mailService.sendMail(dto.email(), "Register", "AUTHENTICATION CODE");
    }
}
