package com.sparta.ma.model;

import java.time.LocalDate;

public class Employee {
    private  int employeeID ;
    private String firstName;
    private String namePrefix;
    private String lastName;
    private  LocalDate dateOfBirth;
    private String middleInitial;
    private String email;
    private LocalDate dateOfJoining;
    private String gender;
    private int salary;

    @Override
    public String toString() {
        String nl = System.lineSeparator();
        return employeeID + nl+namePrefix +nl +firstName +nl + middleInitial +nl + lastName +nl +gender +nl+ email +nl + dateOfBirth +nl+dateOfJoining +nl+ salary;

    }

//Contructor
    public Employee(int employeeID, String namePrefix, String firstName, String middleInitial, String lastName, String gender, String email, LocalDate dateOfBirth, LocalDate dateOfJoining, int salary ) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.namePrefix = namePrefix;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.middleInitial = middleInitial;
        this.email = email;
        this.dateOfJoining = dateOfJoining;
        this.gender = gender;
        this.salary = salary;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }



    public String getNamePrefix() {
        return namePrefix;
    }



    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getEmail() {
        return email;
    }



    public String getGender() {
        return gender;
    }





}
