package com.springboot.crud;

import com.springboot.crud.customer.CustomerController;
import com.springboot.crud.customer.CustomerDataAccessService;
import com.springboot.crud.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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


        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);

        String[] beanDefinitionNames =
                applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
