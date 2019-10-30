package com.sparta.ma.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private  int employeeID ;
    private String firstName;
    private String namePrefix;
    private String lastNamne;
    private  LocalDate DOB;
    private String middleIntial;
    private String email;
    private LocalDate dateOfJoining;
    private String gender;
    private int salary;

    @Override
    public String toString() {
        String nl = System.lineSeparator();
        return employeeID + nl+namePrefix +nl +firstName +nl +middleIntial +nl +lastNamne +nl +gender +nl+ email +nl +DOB +nl+dateOfJoining +nl+ salary;

    }

//Contructor
    public Employee(int employeeID, String namePrefix, String firstName, String middleIntial, String lastNamne, String gender, String email, LocalDate DOB, LocalDate dateOfJoining, int salary ) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.namePrefix = namePrefix;
        this.lastNamne = lastNamne;
        this.DOB = DOB;
        this.middleIntial = middleIntial;
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

    public void setLastNamne(String lastNamne) {
        this.lastNamne = lastNamne;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setMiddleIntial(String middleIntial) {
        this.middleIntial = middleIntial;
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

    public LocalDate getDOB() {
        return DOB;
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



    public String getLastNamne() {
        return lastNamne;
    }



    public String getMiddleIntial() {
        return middleIntial;
    }

    public String getEmail() {
        return email;
    }



    public String getGender() {
        return gender;
    }





}
