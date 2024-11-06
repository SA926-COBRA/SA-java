package com.springboot.crud.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
