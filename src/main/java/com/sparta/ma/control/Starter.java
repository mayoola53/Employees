package com.sparta.ma.control;

import com.sparta.ma.model.Employee;
import com.sparta.ma.model.EmployeeReader;

import java.util.List;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args ) {

        EmployeeReader testerCreateEmployee = new EmployeeReader();
        testerCreateEmployee.readEmployeeCsV("resources/EmployeeRecords.csv");
        List<Employee> printEmployee =  testerCreateEmployee.getEmployeeList();
        for(Employee employee: printEmployee){
            System.out.println(employee);
        }
    }
}
