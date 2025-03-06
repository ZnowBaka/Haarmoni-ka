package com.example.haarmonika.Controller;

import com.example.haarmonika.Model.Customer;
import com.example.haarmonika.Model.Employee;
import com.example.haarmonika.Utilities.Databaseconnection;

import javax.swing.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DatabaseRepository {
    //C i Crud Create employee
    public void createEmployee(Employee employee) {
        String sql = "insert into employees (first_name,last_name,email,phone_number,password) values (?,?,?,?,?)";

        try (Connection connection = Databaseconnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getPhoneNumber());
            preparedStatement.setString(4, employee.getEmail());
            preparedStatement.setString(5, employee.getPassword());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("employee has been created");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void createNewCustomer(Customer customer) {
        String sql = "insert into customers (first_name, last_name, phone_number,email) values (?,?,?,?,?)";

        try (Connection connection = Databaseconnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getPhoneNumber());
            preparedStatement.setString(4, customer.getEmail());

            int rowInserted = preparedStatement.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("customer has been created");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //R i Crud for at read employees
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employees";

        try (Connection connection = Databaseconnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int Id = resultSet.getInt("employee_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String phoneNumber = resultSet.getString("phone_number");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                employees.add(new Employee(Id, firstName, lastName, phoneNumber, email, password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public Employee readEmployee(String email, String password) {
        String sql = "select * from employees where email = ? and password = ?";

        try (Connection connection = Databaseconnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            Employee employee = null;
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery(sql);

            while (resultSet.next()) {
                employee.setId(resultSet.getInt("employee_id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setPhoneNumber(resultSet.getString("phone_number"));
                employee.setEmail(resultSet.getString("email"));
                employee.setPassword(resultSet.getString("password"));
            }
            return employee;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Customer getCustomerFromEmail(String email) {
        String sql = "select * from customers where email = ?";
        Customer customer = null;

        try (Connection connection = Databaseconnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery(sql);

            while (resultSet.next()) {
                int Id = resultSet.getInt("customer_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String phoneNumber = resultSet.getString("phone_number");
                email = resultSet.getString("email");
                customer = new Customer(Id, firstName, lastName, phoneNumber, email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }


    // login check op imod databasen
    public static boolean login(Employee employee) {
        System.out.println("trying to login in DB");

        String sql = "SELECT * FROM employees WHERE email = ? AND password = ?";

        try (Connection connection = Databaseconnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {


            preparedStatement.setString(1, employee.getEmail());
            preparedStatement.setString(2, employee.getPassword());

            ResultSet resultSet = preparedStatement.executeQuery();

            boolean isResultValid = resultSet.next();

            while (resultSet.next()) {
                employee.setId(resultSet.getInt("employee_id"));
                employee.setFirstName(resultSet.getString("first_name"));
                employee.setLastName(resultSet.getString("last_name"));
                employee.setPhoneNumber(resultSet.getString("phone_number"));
                employee.setEmail(resultSet.getString("email"));
                employee.setPassword(resultSet.getString("password"));
            }


            // retunere succes hvis user og pass stemmer overens
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false; // ved fejl retunere false
        }
    }

    //nuke on start
    public static void nukeOnStart(Timestamp nukeDate) {
        String sql = "DELETE FROM Customers WHERE Created_At < ?";

        try (Connection connection = Databaseconnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setTimestamp(1, nukeDate);
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println(rowsDeleted + " rows deleted");
        } catch (SQLException e) {
            e.printStackTrace();
            e.getErrorCode();
        }

    }


}

