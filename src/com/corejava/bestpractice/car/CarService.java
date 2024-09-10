package com.corejava.bestpractice.car;

public class CarService {

    // private CarDaO carDaO = new CarDAO();

    private CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public int registerNewCar(Car car) {
        // Check if car is not null
        // Check if reg number is valid
        // Check if reg number not taken
        // Check if price is < 0
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars() {
        return carDAO.selectAllCars();
    }
}
