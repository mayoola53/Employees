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
    private Map<String,Employee> employeeList = new HashMap<>();

    public Map<String,Employee>  getEmployeeList() {
        return employeeList;
    }
//       public void readEmployeeCsVStream(String PATH){
//           List<Employee> employeeListStream = getEmployeeList();
//           String line = "";
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(PATH));
//            br.readLine();
//            br.lines()
//                    .map(employee2 -> employee2.split(","))
//                    .forEach(employee2 -> employeeList.add(new Employee(employeeListStream.get(0))));
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//       }

    public void readEmployeeCsV(String PATH){
        String line = "";
        String csvSplitBy = ",";
        Employee employee = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            bufferedReader.readLine(); // consume first line and ignore
            line = bufferedReader.readLine();
            while((line = bufferedReader.readLine()) !=null){
                    String[] fields = line.split(csvSplitBy);
                    employee = createEmployee(fields);
                    employeeList.put(fields[0],employee);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Find");
        } catch (IOException e) {

        }

    }

    private Employee createEmployee( String[] fields ){
        return new Employee(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],fields[4],fields[5],fields[6],dateFormater(fields[7]),dateFormater(fields[8]),Integer.parseInt(fields[9]));
    }
///helper class
    private LocalDate dateFormater(String localDate){
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
      LocalDate localDate1 = LocalDate.parse(localDate,formatter);
        return localDate1;
    }

   public String printEmployees(){
        String output = "";
        String newLine = System.lineSeparator();

        for (Employee List : employeeList.values()){
            output = output + List.toString();
            if(List != employeeList.get(employeeList.size()-1)){
                output = "" + output + newLine;
            }

        }

        return output;
    }



}
