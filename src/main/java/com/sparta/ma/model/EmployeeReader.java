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

public class EmployeeReader {
    private Employee employee;
    private List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }


    public void readEmployeeCsV(String PATH){
        String line = "";
        String csvSplitBy = ",";
        Employee employee = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            bufferedReader.readLine(); // consume first line and ignore
            line = bufferedReader.readLine();
            while((line = bufferedReader.readLine()) !=null){
                if(employee != null) {
                    String[] fields = line.split(csvSplitBy);
                    employee = createEmployee(fields);
                    employeeList.add(employee);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Find");
        } catch (IOException e) {

        }

    }

    private Employee createEmployee( String[] fields ){
        return new Employee(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],dateFormater(fields[7]),dateFormater(fields[8]),Integer.parseInt(fields[9]));
    }

    private LocalDate dateFormater(String localDate){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate= formatter.format(localDate);
        LocalDate localDate1 = LocalDate.parse(strDate);
        return localDate1;
    }



}
