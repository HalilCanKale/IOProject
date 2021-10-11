package com.spart.io.Controller;

import com.spart.io.Model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class JDBCDriver {

    public static void JDBC(ArrayList<Employee>records) {
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:Employee.db");) {
            Statement statement = con.createStatement();
            CreateDB(statement);
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO Records(Emp_ID, NAME_PREFIX, FIRST_NAME, MID_INITIAL, LAST_NAME, GENDER, EMAIL, DOB, DOJ, SALARY)" + "VALUES(?,?,?,?,?,?,?,?,?,?)");
            con.setAutoCommit(false);
            AddData(preparedStatement,records);
            con.commit();
            statement.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    private static void CreateDB(Statement statement) throws SQLException {
            statement.executeUpdate("DROP TABLE IF EXISTS Records");
            statement.executeUpdate(
                    "CREATE TABLE \"Records\" (\n" +
                    "\t\"Emp_ID\"\t INTEGER NOT NULL,\n" +
                    "\t\"NAME_PREFIX\"\t TEXT NOT NULL,\n" +
                    "\t\"FIRST_NAME\"\t TEXT NOT NULL,\n" +
                    "\t\"MID_INITIAL\"\t TEXT NOT NULL,\n" +
                    "\t\"LAST_NAME\"\tTEXT NOT NULL,\n" +
                    "\t\"GENDER\"\tTEXT NOT NULL,\n" +
                    "\t\"EMAIL\"\tTEXT NOT NULL,\n" +
                    "\t\"DOB\"\t DATE NOT NULL,\n" +
                    "\t\"DOJ\"\t DATE NOT NULL,\n" +
                    "\t\"SALARY\"\t INTEGER NOT NULL,\n" +
                    "\t PRIMARY KEY(\"Emp_ID\")\n"+")");
    }
    private static void AddData(PreparedStatement preparedStatement, ArrayList<Employee> records) throws SQLException {
            preparedStatement.setInt(1, records.get(1).getEmpID());
            preparedStatement.setString(2, records.get(1).getNamePrefix());
            preparedStatement.setString(3, records.get(1).getfName());
            preparedStatement.setString(4, records.get(1).getMiddleInitial());
            preparedStatement.setString(5, records.get(1).getlName());
            preparedStatement.setString(6, records.get(1).getGender());
            preparedStatement.setString(7, records.get(1).getEmail());
            preparedStatement.setDate(8, records.get(1).getDob());
            preparedStatement.setDate(9, records.get(1).getDoj());
            preparedStatement.setInt(10, records.get(1).getSalary());
            preparedStatement.execute();
            preparedStatement.close();

    }
}
