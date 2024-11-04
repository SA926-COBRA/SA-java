package com.springboot.crud.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao {

    //db
    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        customers.add(new Customer(1, "Alex", "alex@gmail.com", 21));
        customers.add(new Customer(2, "John", "john@gmail.com", 25));
        customers.add(new Customer(3, "Sam", "sam@gmail.com", 31));
        customers.add(new Customer(4, "Will", "will@gmail.com", 28));
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}
