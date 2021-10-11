package com.spart.io.Controller;

import com.spart.io.Controller.DateTime;
import com.spart.io.Model.Employee;

import java.sql.Date;

public class EmployeeGenerator {
    public static void CreateEmployee(String []data, Employee emp){
        int id = Integer.parseInt(data[0]);
        String prefix = data[1];
        String fName = data[2];
        String mName = data[3];
        String lName = data[4];
        String gen = data[5];
        String email = data[6];
        Date dob = DateTime.formatDate(data[7]);
        Date doj = DateTime.formatDate(data[8]);
        int salary = Integer.parseInt(data[9]);

        emp.setEmpID(id);
        emp.setNamePrefix(prefix);
        emp.setfName(fName);
        emp.setMiddleInitial(mName);
        emp.setlName(lName);
        emp.setGender(gen);
        emp.setEmail(email);
        emp.setDob(dob);
        emp.setDoj(doj);
        emp.setSalary(salary);
    }
}
