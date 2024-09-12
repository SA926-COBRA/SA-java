package com.projects.carbooking.booking;

import java.util.Objects;

public class Booking {
    private int userID;
    private String carRegNumber;

    public Booking() {
    }

    public Booking(int userID, String carRegNumber) {
        this.userID = userID;
        this.carRegNumber = carRegNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getCarRegNumber() {
        return carRegNumber;
    }

    public void setCarRegNumber(String carRegNumber) {
        this.carRegNumber = carRegNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return userID == booking.userID && Objects.equals(carRegNumber, booking.carRegNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, carRegNumber);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userID=" + userID +
                ", carRegNumber='" + carRegNumber + '\'' +
                '}';
    }
}
