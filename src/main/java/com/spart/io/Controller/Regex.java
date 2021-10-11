package com.spart.io.Controller;

import com.spart.io.Model.Employee;

public class Regex {

    public static boolean RegexCall(String[] data, Employee emp) {
        boolean res=true;

        if (!(emp.getEmpID() >= 0)) res = false;
        if (!emp.getNamePrefix().matches("^[A-Z][a-z]{1,5}[.]$")) res = false;
        if (!emp.getfName().matches(("^[A-Z][-a-zA-Z]+$"))) res = false;
        if (!emp.getMiddleInitial().matches("[a-zA-Z]+")) res = false;
        if (!emp.getlName().matches("^[A-Z][-a-zA-Z]+$")) res = false;
        if (!emp.getGender().matches(("^[F|M]$"))) res = false;
        if (!emp.getEmail().matches("^(.+)@(.+)$")) res = false;
        if (!(emp.getSalary() >= 0)) res = false;

        return res;

    }

}