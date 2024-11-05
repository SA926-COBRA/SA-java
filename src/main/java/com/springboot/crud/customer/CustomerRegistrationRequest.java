package com.springboot.crud.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {

}
