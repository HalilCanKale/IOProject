package com.spart.io.Model;

import java.util.Date;

public class DateTime {


    public static Date formatDate(String s){
        java.time.format.DateTimeFormatter df = java.time.format.DateTimeFormatter.ofPattern("M/d/yyyy");
        return java.sql.Date.valueOf(java.time.LocalDate.parse(s, df));
    }
}
