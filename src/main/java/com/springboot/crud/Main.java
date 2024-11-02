package com.springboot.crud;

import com.springboot.crud.customer.CustomerController;
import com.springboot.crud.customer.CustomerDataAccessService;
import com.springboot.crud.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        /*
        Never Do this
        CustomerService customerService =
                new CustomerService(new CustomerDataAccessService());
        CustomerController customerController =
                new CustomerController(customerService);
        */

//        System.out.println(Customers);
        SpringApplication.run(Main.class, args);
    }
}
