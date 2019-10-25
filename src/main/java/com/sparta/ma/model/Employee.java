package com.sparta.ma.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private final int employeeID ;
    private String firstName;
    private String namePrefix;
    private String lastNamne;
    private final Date DOB;
    private char middleIntial;
    private String email;
    private final Date dateOfJoining;
    private char gender;
    private int salary;

    public Employee(int employeeID, Date DOB, Date dateOfJoining) {
        this.employeeID = employeeID;
        this.DOB = DOB;
        this.dateOfJoining = dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNamne() {
        return lastNamne;
    }

    public void setLastNamne(String lastNamne) {
        this.lastNamne = lastNamne;
    }

    public char getMiddleIntial() {
        return middleIntial;
    }

    public void setMiddleIntial(char middleIntial) {
        this.middleIntial = middleIntial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    private String dateFormater(Date DOB){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(DOB);
        return strDate;
    }


}
