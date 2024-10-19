package com.practice.exercise2;

import java.util.Objects;

public class Contact {
    private String telecom;
    private String number;

    public Contact(String telecom, String number) {
        this.telecom = telecom;
        this.number = number;
    }

    public String getTelecom() {
        return telecom;
    }

    public void setTelecom(String telecom) {
        this.telecom = telecom;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(telecom, contact.telecom) && Objects.equals(number, contact.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telecom, number);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "telecom='" + telecom + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
