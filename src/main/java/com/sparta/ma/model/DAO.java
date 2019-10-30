package com.sparta.ma.model;

import java.sql.*;
import java.util.List;

public class DAO {
    private final String QUERY = "select first_name,last_name from actor where actor_id = ?";
    private final String URL = "jdbc:mysql://localhost/Employee?user=root&password=mayowa123";


    public void runSQLQuery(String id) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            PreparedStatement statement = connection.prepareStatement(QUERY);
            statement.setString(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
//                System.out.println("First_name is "+ resultSet.getString(1));
//                System.out.println("Last_ name is "+ resultSet.getString(2));

            }
        } catch (SQLException e) {

        }
    }

    public void readArrayListToDB(List<Employee> employeeList) {
        String INSERTSTATEMENT = "INSERT INTO employee_table values (?,?,?,?,?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(URL)) {
            for (Employee employee : employeeList) {
                PreparedStatement statement = connection.prepareStatement(INSERTSTATEMENT);
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


