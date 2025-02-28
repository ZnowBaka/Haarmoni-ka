package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Customer;
import com.example.haarmonika.Model.Employee;
import com.example.haarmonika.Model.Person;

public class PersonController {
    Datarepo datarepo = new Datarepo();
    public Customer newCustomer(String firstName, String lastName, String email, String phoneNumber) {
        Customer customer = new Customer(firstName, lastName, email, phoneNumber);
        datarepo.createNewCustomer(customer);
        return customer;
    };

    public Employee newEmployee(String firstName, String lastName, String email, String phoneNumber, String password) {
        Employee employee = new Employee(firstName,lastName,email,phoneNumber, password);
        return employee;
    }


    public Customer findCustomer(String email) {
            if(datarepo.getCustomerFromEmail(email)==null) {
                return null;
            } else {
             return datarepo.getCustomerFromEmail(email);
            }
    }
}
