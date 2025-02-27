package com.example.haarmonika;
import com.example.haarmonika.Model.Customer;
import com.example.haarmonika.Model.Employee;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Datarepo {
    //C i Crud Creat employee
    public void creatEmployee(Employee employee){
        String sql = "insert into employee (LastName,FirstName,Email,PhoneNumber,Password) values (?,?,?,?,?)";

        try (Connection connection = Databaseconnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1, employee.getLastName());
            preparedStatement.setString(2, employee.getFirstName());
            preparedStatement.setString(3, employee.getPhoneNumber());
            preparedStatement.setString(4,employee.getEmail());
            preparedStatement.setString(5, employee.getPassword());

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("employee has been created");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }
    //R u Crud for at read employees
    public  List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee";

        try (Connection connection = Databaseconnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)){

            while(resultSet.next()){
                int Id =resultSet.getInt("Id");
                String LastName = resultSet.getString("LastName");
                String FirstName = resultSet.getString("FirstName");
                String Email = resultSet.getString("Email");
                String PhoneNumber = resultSet.getString("PhoneNumber");
                String Password = resultSet.getString("Password");
                employees.add(new Employee(Id,LastName,FirstName,Email,PhoneNumber,Password));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
    public static boolean login(String Email, String password) {

        String sql = "SELECT * FROM employees WHERE Email = ? AND password = ?";

        try (Connection connection = DriverManager.getConnection(sql);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, Email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // retunere succes hvis user og pass stemmer overens
            return resultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false; // ved fejl retunere false
        }
    }
}

