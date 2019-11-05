package com.sparta.ma.control;

import com.sparta.ma.model.DAO;
import com.sparta.ma.model.Employee;
import com.sparta.ma.model.EmployeeReader;
import org.w3c.dom.ls.LSOutput;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args ) {
        DAO dao = new DAO();
        EmployeeReader employeeReader = new EmployeeReader();
        long start = System.nanoTime();
        dao.splitArrays(employeeReader.readEmployeeCsV());
        long end = System.nanoTime();

        double timeInSeconds = (double) (end-start)/1000000000;
        System.out.println(timeInSeconds);

    }


}
