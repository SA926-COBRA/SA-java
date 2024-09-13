package com.projects.carbooking.booking;

public class BookingService {
    private Booking[] bookings = new Booking[100];
    private int bookingCount = 0;

    public void bookCar(int userID, String regNumber) {
        Booking booking = new Booking(userID, regNumber);
        bookings[bookingCount] = booking;
        bookingCount++;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    // New method to retrieve bookings for a specific user
    public String[] getCarsBookedByUser(int userId) {
        String[] bookedCars = new String[100];
        int count = 0;
        for (Booking booking : bookings) {
            if (booking != null && booking.getUserID() == userId) {
                bookedCars[count] = booking.getCarRegNumber();
                count++;
            }
        }
        return bookedCars;
    }
}
