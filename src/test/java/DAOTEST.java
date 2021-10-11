package com.spart.io.Controller;

import com.spart.io.Model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class DAOTEST {
    @Test
    public static void main(String[] args) {
        DAO obj = new CRUD();

        Date dob= new Date(17/7/1998);
        Date doj= new Date(20/8/2020);
        Employee emp1=new Employee(133453,"Mr.","Halil","C","Kale","M","Halil@hotmail.co.uk",dob,doj,3432);

        obj.deleteEmployee(80280);
    }

}
