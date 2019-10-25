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
        //intialise everything else in the constructor
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



    public char getGender() {
        return gender;
    }


    private String dateFormater(Date DOB){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(DOB);
        return strDate;
    }


}
