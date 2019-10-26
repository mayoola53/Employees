package com.sparta.ma.control;

import com.sparta.ma.model.EmployeeManager;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args )
    {
        LocalDate localDate =  LocalDate.of(1997,2,1);
        EmployeeManager reader = new EmployeeManager(1,localDate,localDate);



    }
}
