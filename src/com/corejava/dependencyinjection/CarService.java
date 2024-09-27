package com.corejava.dependencyinjection;

public class CarService {
    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

    public CarService(
            CarDAO carDAO,
            EmailService emailService,
            MOTService motService) {

        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
    }
}
