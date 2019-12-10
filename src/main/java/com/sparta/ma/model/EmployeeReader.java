package com.sparta.ma.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class EmployeeReader {
    private Employee employee;
    private Map<String, Employee> employeeMap = new HashMap<>();
    private int count= 0;

    public int getCount() {
        return count;
    }


    Map<String, Employee> duplicates = new HashMap<>();

    String PATH = "resources/EmployeeRecordsLarge.csv";
    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public Map<String, Employee> getDuplicates() {
        return duplicates;
    }

    public Map <String,Employee> readEmployeeCsV() {
        String line = "";
        String csvSplitBy = ",";
        Employee employee = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
//            bufferedReader.readLine(); // consume first line and ignore
            //add if statement to check for first line looks like
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(csvSplitBy);
                employee = createEmployee(fields);
                if(employeeMap.containsKey(fields[0])) {
                    duplicates.put(fields[0], employee);
                }else {
                    employeeMap.put(fields[0],employee);
                    count++;
                }

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Find");
        } catch (IOException e) {

        }
       return employeeMap;
    }
    private Employee createEmployee(String[] fields) {
        return new Employee(Integer.parseInt(fields[0]), fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], dateFormater(fields[7]), dateFormater(fields[8]), Integer.parseInt(fields[9]));
    }

    ///helper class
    private LocalDate dateFormater(String localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate localDate1 = LocalDate.parse(localDate, formatter);
        return localDate1;
    }
    public String printEmployees() {
        String output = "";
        String newLine = System.lineSeparator();

        for (Employee List : employeeMap.values()) {
            output = output + List.toString();
            if (List != employeeMap.get(employeeMap.size() - 1)) {
                output = "" + output + newLine;
            }

        }

        return output;
    }





}
