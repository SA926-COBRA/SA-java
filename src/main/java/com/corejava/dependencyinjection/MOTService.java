package com.corejava.dependencyinjection;

public class MOTService {
    private EmailService emailService;

    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
