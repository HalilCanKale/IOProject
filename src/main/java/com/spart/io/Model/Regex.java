package com.spart.io.Model;

import java.sql.Date;

public class Regex {

    public static boolean RegexCall(String[] data, Employee emp) {
        boolean res = true;
        int id = Integer.parseInt(data[0]);
        String prefix = data[1];
        String fName = data[2];
        String mName = data[3];
        String lName = data[4];
        String gen = data[5];
        String email = data[6];
        java.sql.Date dob = DateTime.formatDate(data[7]);
        Date doj = DateTime.formatDate(data[8]);
        int salary = Integer.parseInt(data[9]);

        if (!(id >= 0)) res = false;
        if (!prefix.matches("^[A-Z][a-z]{1,5}[.]$")) res = false;
        if (!fName.matches(("^[A-Z][-a-zA-Z]+$"))) res = false;
        if (!mName.matches("[a-zA-Z]+")) res = false;
        if (!lName.matches("^[A-Z][-a-zA-Z]+$")) res = false;
        if (!gen.matches(("^[F|M]$"))) res = false;
        if (!email.matches("^(.+)@(.+)$")) res = false;
        if (!(salary >= 0)) res = false;

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

        return res;

    }

}