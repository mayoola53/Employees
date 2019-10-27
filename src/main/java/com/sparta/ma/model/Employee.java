package com.sparta.ma.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private final int employeeID ;
    private String firstName;
    private String namePrefix;
    private String lastNamne;
    private final LocalDate DOB;
    private char middleIntial;
    private String email;
    private final LocalDate dateOfJoining;
    private char gender;
    private int salary;

    public Employee(int employeeID, LocalDate DOB, LocalDate dateOfJoining) {
        this.employeeID = employeeID;
        this.DOB = DOB;
        this.dateOfJoining = dateOfJoining;
        //initialise everything else in the constructor
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



    public char getMiddleIntial() {
        return middleIntial;
    }

    public String getEmail() {
        return email;
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

    public void setMiddleIntial(char middleIntial) {
        this.middleIntial = middleIntial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }





}
