package com.spart.io.View;

import com.spart.io.Model.Employee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOMain {
    public static void main(String[] args) throws FileNotFoundException {
        int value=0;
        try (FileReader in = new FileReader("EmployeeRecords.csv");
             BufferedReader out = new BufferedReader(in)) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        Path myPath= Paths.get("EmployeeRecords.csv");
        System.out.println(myPath);
        System.out.println(Files.isRegularFile(myPath));
    }
}