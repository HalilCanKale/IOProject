package com.spart.io.Controller;

import com.spart.io.Model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;

public class CRUD implements DAO {

    @Override
    public void getEmployee(int id) {
        try{
            Connector connect =Connector.getIns();
            Connection connection= connect.getCon();
            Statement statement =connection.createStatement();
            ResultSet s=statement.executeQuery("SELECT * FROM Records WHERE Emp_ID =" + id);
            System.out.println(
                    "Employee_ID: " + s.getInt("Emp_ID")+"  "+
                    "Prefix: " +s.getString("NAME_PREFIX")+"  "+
                            "First_Name: "+s.getString("FIRST_NAME")+"  "+
                            "Middle_Initial: "+s.getString("MID_INITIAL")+"  "+
                            "Last_Name: "+s.getString("LAST_NAME")+"  "+
                            "Gender: "+s.getString("GENDER")+"  "+
                            "Email: "+s.getString("EMAIL")+"  "+
                            "DOB: "+s.getDate("DOB")+"  "+
                            "DOJ: "+s.getDate("DOJ")+"  "+
                            "SALARY: "+s.getInt("SALARY"));
            statement.close();
            connection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }


    @Override
    public void addNewEmployee(Employee employee) {
        try{
            Connector connect =Connector.getIns();
            Connection connection= connect.getCon();
            PreparedStatement statement= connection.prepareStatement("INSERT INTO Records(Emp_ID, NAME_PREFIX, FIRST_NAME, MID_INITIAL, LAST_NAME, GENDER, EMAIL, DOB, DOJ, SALARY)" + "VALUES(?,?,?,?,?,?,?,?,?,?)");
            statement.setInt(1, employee.getEmpID());
            statement.setString(2, employee.getNamePrefix());
            statement.setString(3, employee.getfName());
            statement.setString(4, employee.getMiddleInitial());
            statement.setString(5, employee.getlName());
            statement.setString(6, employee.getGender());
            statement.setString(7, employee.getEmail());
            statement.setDate(8, employee.getDob());
            statement.setDate(9, employee.getDoj());
            statement.setInt(10, employee.getSalary());
            statement.execute();
            statement.close();
            connection.setAutoCommit(false);
            connection.commit();
            connection.close();
            statement.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    @Override
    public void updateEmployeeSalary(int id, int newSalary) {
        try{
            System.out.println("update");
            Connector connect =Connector.getIns();
            Connection connection= connect.getCon();
            Statement statement =connection.createStatement();
            statement.executeUpdate("UPDATE Records SET SALARY=" +newSalary + " WHERE Emp_ID = "+ id);
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
