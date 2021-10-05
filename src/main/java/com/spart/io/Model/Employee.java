package com.spart.io.Model;

import java.util.Date;
//Emp ID,Name Prefix,First Name,Middle Initial,Last Name,Gender,E Mail,Date of Birth,Date of Joining,Salary

public class Employee {
    private int empID;
    private String namePrefix;
    private String fName;
    private char middleInitial;
    private String lName;
    private boolean gender;
    private String email;
    private Date dob;
    private Date doj;
    private int salary;

    public Employee(int empID, String namePrefix, String fName, char middleInitial, String lName,
                    boolean gender, String email, Date dob, Date doj, int salary)
    {
        this.empID = empID;
        this.namePrefix = namePrefix;
        this.fName = fName;
        this.middleInitial = middleInitial;
        this.lName = lName;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.doj = doj;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
