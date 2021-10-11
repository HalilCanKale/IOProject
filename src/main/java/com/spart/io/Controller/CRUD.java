package com.spart.io.Controller;

import com.spart.io.Model.Employee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD implements DAO {

    @Override
    public void getEmployee(int id) {

    }

    @Override
    public void addNewEmployee(Employee employee) {
        try{
            Connector connect =Connector.getIns();
            Connection connection= connect.getCon();
            Statement statement =connection.createStatement();
            statement.executeUpdate("INSERT INTO Records" + new Employee());
            statement.close();
            connection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    @Override
    public void updateEmployeeSalary(Employee employee) {
        try{
            System.out.println("update");
            Connector connect =Connector.getIns();
            Connection connection= connect.getCon();
            Statement statement =connection.createStatement();
            statement.executeUpdate("DELETE FROM Records" + "WHERE ID = "+ employee.getEmpID());
            statement.close();
            connection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    @Override
    public void deleteEmployee(int id){
        try{
            System.out.println("delete");
            Connector connect =Connector.getIns();
            Connection connection= connect.getCon();
            Statement statement =connection.createStatement();
            statement.executeUpdate("DELETE FROM Records WHERE Emp_ID = "+ id);
            statement.close();
            connection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }
}
