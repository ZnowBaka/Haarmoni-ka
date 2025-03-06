package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Customer;
import com.example.haarmonika.Model.Employee;

public class PersonController {
    DatabaseRepository databaseRepository = new DatabaseRepository();

    public Customer newCustomer(String firstName, String lastName, String email, String phoneNumber) {
        Customer customer = new Customer(firstName, lastName, email, phoneNumber);
        databaseRepository.createNewCustomer(customer);
        return customer;
    }



    public Employee newEmployee(String firstName, String lastName, String email, String phoneNumber, String password) {
        Employee employee = new Employee(firstName, lastName, email, phoneNumber, password);
        return employee;
    }

    public Employee newLogin(String email, String password) {
        Employee employee = new Employee(email, password);
        return employee;
    }



    public Customer findCustomer(String email) {
        if (databaseRepository.getCustomerFromEmail(email) == null) {
            return null;
        } else {
            return databaseRepository.getCustomerFromEmail(email);
        }
    }
}
