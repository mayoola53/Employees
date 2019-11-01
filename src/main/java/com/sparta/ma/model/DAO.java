package com.sparta.ma.model;

import java.sql.*;
import java.util.List;
import java.util.Map;

public class DAO {
    private final String URL = "jdbc:mysql://localhost/Employee?user=root&password=mayowa123";
    String QUERY = "INSERT INTO employee_table values (?,?,?,?,?,?,?,?,?,?)";
    public void readArrayListToDB(Map<String,Employee> employeeList) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            for (Employee employee : employeeList.values()) {
                PreparedStatement statement = connection.prepareStatement(QUERY);
                statement.setInt(1,employee.getEmployeeID());
                statement.setString(2, employee.getNamePrefix());
                statement.setString(3, employee.getFirstName());
                statement.setString(4, employee.getMiddleIntial());
                statement.setString(5, employee.getLastNamne());
                statement.setString(6, employee.getGender());
                statement.setString(7, employee.getEmail());
                statement.setString(8, employee.getDOB().toString());
                statement.setString(9, employee.getDateOfJoining().toString());
                statement.setInt(10,employee.getSalary());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}


