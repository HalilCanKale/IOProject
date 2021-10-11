package com.spart.io.Controller;

import com.spart.io.Model.Employee;

public interface DAO {
    public void getEmployee(int id);
    public void addNewEmployee(Employee employee);
    public void updateEmployeeSalary(int id, int newSalary);
    public void deleteEmployee(int id);
}
