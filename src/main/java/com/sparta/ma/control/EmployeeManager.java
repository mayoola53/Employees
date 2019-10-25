package com.sparta.ma.control;

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
                String[] employee = line.split(cvsSplitBy);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Find");
        } catch (IOException e) {

        }
    }



}
