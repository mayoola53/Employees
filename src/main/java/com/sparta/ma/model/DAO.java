package com.sparta.ma.model;

import java.sql.*;
import java.util.Arrays;
import java.util.Map;

public class DAO{


    private final String URL = "jdbc:mysql://localhost/Employee?user=root&password=mayowa123";
    String QUERY = "INSERT INTO employee_table values (?,?,?,?,?,?,?,?,?,?)";

    public void readArrayListToDB(Map<String,Employee> employeeList) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            for (Employee employee : employeeList.values()) {
                PreparedStatement statement = connection.prepareStatement(QUERY);
                statement.setInt(1,employee.getEmployeeID());
                statement.setString(2, employee.getNamePrefix());
                statement.setString(3, employee.getFirstName());
                statement.setString(4, employee.getMiddleInitial());
                statement.setString(5, employee.getLastName());
                statement.setString(6, employee.getGender());
                statement.setString(7, employee.getEmail());
                statement.setDate(8, Date.valueOf(employee.getDateOfBirth()));
                statement.setDate(9, Date.valueOf(employee.getDateOfJoining()));
                statement.setInt(10,employee.getSalary());
                statement.executeUpdate();
            }
        } catch (SQLException e) {

        }
    }

    public void splitArrays(Map<String,Employee> employee){
        Employee[] arraysOfEmp = employee.values().toArray(new Employee[employee.size()]);
        int count =  arraysOfEmp.length;
        Thread[] threadsArray  = new Thread[150];
        int noOfThreads = threadsArray.length;
        int divisableBy = count/noOfThreads;

        for(int i = 0 ; i<noOfThreads; i++){
            final int j = i;
            Runnable runnable = ()-> readArrayListToDB(Arrays.copyOfRange(arraysOfEmp,divisableBy*j,divisableBy*(j+1)));
            threadsArray[i] = new Thread(runnable);
            threadsArray[i].start();
        }




    }
    public void readArrayListToDB(Employee[] employees) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            for (Employee employee : employees) {
                PreparedStatement statement = connection.prepareStatement(QUERY);
                statement.setInt(1,employee.getEmployeeID());
                statement.setString(2, employee.getNamePrefix());
                statement.setString(3, employee.getFirstName());
                statement.setString(4, employee.getMiddleInitial());
                statement.setString(5, employee.getLastName());
                statement.setString(6, employee.getGender());
                statement.setString(7, employee.getEmail());
                statement.setDate(8, Date.valueOf(employee.getDateOfBirth()));
                statement.setDate(9, Date.valueOf(employee.getDateOfJoining()));
                statement.setInt(10,employee.getSalary());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}


