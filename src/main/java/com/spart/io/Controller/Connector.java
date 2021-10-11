package com.spart.io.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Connector {
    final String url="jdbc:sqlite:Employee.db";
    private static Connector ins;
    private Connection con= DriverManager.getConnection(url);

    public Connector() throws SQLException {
    }

    public static Connector getIns() throws SQLException {
        if(ins==null){
            ins = new Connector();
        }
        return ins;
    }

    public Connection getCon() {
        return con;
    }
}
