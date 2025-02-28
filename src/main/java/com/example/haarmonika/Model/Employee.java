package com.example.haarmonika.Model;

public class Employee extends Person {
    private boolean adminStatus;

    public Employee(int id, String LastName, String FirstName, String email, String phoneNumber, String password) {
        super(id, LastName, FirstName, email, phoneNumber, password);
    }


    public Employee(String firstName, String lastName, String email, String phoneNumber, String password) {
        super(firstName, lastName, email, phoneNumber, password);

    // Attribute specific for employees
    public boolean isAdminStatus() {
        return adminStatus;

    }

    public void setAdminStatus(boolean adminStatus) {
        this.adminStatus = adminStatus;
    }


    public boolean getAdminStatus() {
        return adminStatus;
    }


    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String LastName) {
        super.setLastName(LastName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String FirstName) {
        super.setFirstName(FirstName);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }


}
