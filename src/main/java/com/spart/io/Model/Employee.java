package com.spart.io.Model;

import java.sql.Date;
import java.util.Objects;
//Emp ID,Name Prefix,First Name,Middle Initial,Last Name,Gender,E Mail,Date of Birth,Date of Joining,Salary

public class Employee {
    private int empID;
    private String namePrefix;
    private String fName;
    private String middleInitial;
    private String lName;
    private String gender;
    private String email;
    private Date dob;
    private Date doj;
    private int salary;

    public Employee(int empID, String namePrefix, String fName, String middleInitial, String lName,
                    String gender, String email, Date dob, Date doj, int salary)
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

    public Employee() {

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

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", namePrefix='" + namePrefix + '\'' +
                ", fName='" + fName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lName='" + lName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                ", salary=" + salary +
                '}';
    }
}
