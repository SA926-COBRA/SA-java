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
}
