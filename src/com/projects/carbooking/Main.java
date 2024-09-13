package com.projects.carbooking;

import com.projects.carbooking.booking.Booking;
import com.projects.carbooking.booking.BookingService;
import com.projects.carbooking.car.Car;
import com.projects.carbooking.car.CarBrand;
import com.projects.carbooking.car.CarService;
import com.projects.carbooking.user.User;
import com.projects.carbooking.user.UserService;

import java.util.Scanner;

public class Main {
    private static final UserService userService = new UserService();
    private static final CarService carService = new CarService();
    private static final BookingService bookingService = new BookingService();

    public static void main(String[] args) {
        initializeData();
        runApp();
    }

    // Preload some users and cars into the system
    private static void initializeData() {
        // Add some users
        userService.createUser("Alice", "alice@example.com");
        userService.createUser("Bob", "bob@example.com");

        // Add some cars
        carService.addCar("ABC123", CarBrand.FERRARI, false);
        carService.addCar("XYZ789", CarBrand.TESLA, true);
    }

    // Main application menu
    private static void runApp() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    handleBookCar(scanner);
                    break;
                case 2:
                    handleViewUserBookings(scanner);
                    break;
                case 3:
                    handleViewAllBookings();
                    break;
                case 4:
                    handleViewAvailableCars();
                    break;
                case 5:
                    handleViewAvailableElectricCars();
                    break;
                case 6:
                    handleViewAllUsers();
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nCar Booking System - Menu:");
        System.out.println("1. Book Car");
        System.out.println("2. View All User Booked Cars");
        System.out.println("3. View All Bookings");
        System.out.println("4. View Available Cars");
        System.out.println("5. View Available Electric Cars");
        System.out.println("6. View All Users");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleBookCar(Scanner scanner) {
        System.out.print("Enter user ID: ");
        String userID = scanner.nextLine();

        System.out.print("Enter car registration number: ");
        String carRegNumber = scanner.nextLine();

        if (carService.bookCar(carRegNumber)) {
            bookingService.bookCar(Integer.parseInt(userID), carRegNumber);
        }
    }

    private static void handleViewUserBookings(Scanner scanner) {
        System.out.print("Enter user ID: ");
        int userId = scanner.nextInt();
        String[] bookedCars = bookingService.getCarsBookedByUser(userId);
        System.out.println("Cars booked by user " + userId + ": ");
        for (String car : bookedCars) {
            if (car != null) {
                System.out.println(car);
            }
        }
    }

    private static void handleViewAllBookings() {
        Booking[] bookings = bookingService.getBookings();
        for (Booking booking : bookings) {
            if (booking != null) {
                System.out.println(booking);
            }
        }
    }

    private static void handleViewAvailableCars() {
        Car[] availableCars = carService.getAvailableCars();
        for (Car car : availableCars) {
            if (car != null && car.isAvailable()) {
                System.out.println(car);
            }
        }
    }

    private static void handleViewAvailableElectricCars() {
        Car[] electricCars = carService.getAvailableElectricCars();
        for (Car car : electricCars) {
            if (car != null && car.isAvailable()) {
                System.out.println(car);
            }
        }
    }

    private static void handleViewAllUsers() {
        User[] users = userService.getAllUsers();
        for (User user : users) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }
}