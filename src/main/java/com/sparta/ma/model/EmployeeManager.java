package com.sparta.ma.model;

import com.sparta.ma.model.Employee;

import javax.management.Attribute;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeManager {
    private Employee employee;
   // String PATH = "resources/EmployeeRecords.csv";
//    public EmployeeManager(int employeeID, LocalDate DOB, LocalDate dateOfJoining) {
//      employee = new Employee(employeeID,DOB,dateOfJoining);
//    }

    public List<Employee> readEmployeeCsV(String PATH){
        String line = "";
        String csvSplitBy = ",";
        Employee employee;
         List<Employee>  employees = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            while((line = bufferedReader.readLine()) !=null){
                if(employees != null) {
                    employee = createEmployee(csvSplitBy);
                    //Employee employee = new Employee(employeeList[0], );
                    employees.add(employee);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Find");
        } catch (IOException e) {

        }
        return employees;
    }

    private Employee createEmployee( String cvsSplitBy ){
        Employee newEmployee =  employee;
        String line = "";

        String[] attributesHolder = line.split(cvsSplitBy);

        int indexOfAttribute = 0;
        for(String attribute: attributesHolder){
            switch (indexOfAttribute){


                case 1:
                    newEmployee.setNamePrefix(attribute);
                    break;
                case 2:
                    newEmployee.setFirstName(attribute);
                    break;
                case 3:
                    newEmployee.setMiddleIntial(attribute.charAt(0));
                    break;
                case 4:
                    newEmployee.setLastNamne(attribute);
                    break;
                case 5:
                    newEmployee.setGender(attribute.charAt(0));
                    break;
                case 6:
                    newEmployee.setEmail(attribute);
                    break;
                case 9:
                    newEmployee.setSalary(Integer.parseInt(attribute));
                    break;
                case 0:
                    ///trying to set default values in array list to values bellow;
                    LocalDate dateOfJoining =  LocalDate.parse(attribute);
                    LocalDate dateOfBirth  =  LocalDate.parse(attribute);
                    int employeeID = Integer.parseInt(attribute);
                    newEmployee = new Employee(employeeID,dateOfJoining,dateOfBirth);


            }

         indexOfAttribute++;

        }

        return newEmployee;
    }

    private String dateFormater(LocalDate localDate){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(localDate);
        return strDate;
    }



}
