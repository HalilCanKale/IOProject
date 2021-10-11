package com.spart.io.Controller;
import com.spart.io.Model.Employee;
import com.spart.io.Model.Regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class IOMain {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> records = new ArrayList<>();
        ArrayList<Employee>special = new ArrayList<>();
        try (BufferedReader in =new BufferedReader(new FileReader("EmployeeRecords.csv"))){
            in.readLine();
            String line1=null;
            while((line1 = in.readLine())!=null){
                String [] data= line1.split(",");
                Employee emp= new Employee();
                EmployeeGenerator.CreateEmployee(data,emp);
                boolean res= Regex.RegexCall(data,emp);
                if(res && !records.contains(emp))
                {
                    records.add(emp);
                }
                else
                {
                    special.add(emp);
                }
            }
            DuplicateScan.duplicateDetection(records,special);
            System.out.println(records.size());
            System.out.println(special.size());
            JDBCDriver.JDBC(records);
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}

