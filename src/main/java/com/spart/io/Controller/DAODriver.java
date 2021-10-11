package com.spart.io.Controller;

import com.spart.io.Model.Employee;

import java.sql.Date;

public class DAODriver {

      public static void main(String[] args) {
            DAO obj = new CRUD();

            Date dob= new Date(17/7/1998);
            Date doj= new Date(20/8/2020);

            Employee emp1=new Employee(133453,"Mr.","Halil","C","Kale","M","Halil@hotmail.co.uk",dob,doj,3432);
//          obj.addNewEmployee(emp1); //testing adding new Employee
//          obj.deleteEmployee(802800); //testing the delete Employee
//          obj.getEmployee(emp1); //testing the get Employee
            obj.updateEmployeeSalary(802800,500000); //testing updating an Employee's salary

      }

}
