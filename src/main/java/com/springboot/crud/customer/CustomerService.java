package com.springboot.crud.customer;

import com.springboot.crud.exception.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    private final CustomerDao customerDao;

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomers(Integer id) {
        return customerDao.selectCustomerById(id)
                .orElseThrow(() -> new ResourceNotFound(
                        "Customer with id [%s] not found".formatted(id)
                ));
    }
}
