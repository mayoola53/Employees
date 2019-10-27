package com.sparta.ma.control;

import com.sparta.ma.model.Employee;
import com.sparta.ma.model.EmployeeManager;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args )
    {
        List<Employee> tester = new ArrayList<>();
        EmployeeManager testerCreateEmployee =  new EmployeeManager();
     tester = testerCreateEmployee.readEmployeeCsV("resources/EmployeeRecords.csv");

     for(Employee person: tester){
         System.out.println(person);
     }


    }
}
