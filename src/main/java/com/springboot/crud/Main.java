package com.springboot.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

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

        // Spring IoC Container (Inspecting the beans managed by Spring)
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(Main.class, args);

        String[] beanDefinitionNames =
                applicationContext.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        printBeans(applicationContext);
    }

    @Bean
    public Foo getFoo() {
        return new Foo("bar");
    }

    record Foo(String name) {
    }

    // Custom method to print beans
    private static void printBeans(ConfigurableApplicationContext ctx) {
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
