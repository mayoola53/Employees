package com.sparta.ma.control;

import com.sparta.ma.model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeManager {
    String PATH = "resources/EmployeeRecords.csv";

    private void readEmployeeCsV(){
        String line = "";
        String cvsSplitBy = ",";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            while((line = bufferedReader.readLine()) !=null){
                String[] employeeList = line.split(cvsSplitBy);
                //Employee employee = new Employee(employeeList[0], );

            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Find");
        } catch (IOException e) {

        }
    }



}
