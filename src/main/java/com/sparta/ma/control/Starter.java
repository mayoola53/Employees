package com.sparta.ma.control;

import com.sparta.ma.model.DAO;
import com.sparta.ma.model.Employee;
import com.sparta.ma.model.EmployeeReader;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args ) {
        DAO dao = new DAO();
        EmployeeReader testerCreateEmployee = new EmployeeReader();
        testerCreateEmployee.readEmployeeCsV("resources/testerWithDuplicates.csv");
        Map<String,Employee> printEmployee = testerCreateEmployee.getEmployeeMap();
        System.out.println(testerCreateEmployee.getDuplicates(printEmployee).toString());
        System.out.println(testerCreateEmployee.getDuplicates(printEmployee).size());
//        System.out.println(testerCreateEmployee.printEmployees());
//        System.out.println(testerCreateEmployee.getEmployeeList().size());
//        dao.readArrayListToDB(testerCreateEmployee.getDuplicates(printEmployee));``


    }
}
