package com.spart.io.Controller;

import com.spart.io.Model.Employee;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateScan {

    public static void duplicateDetection(ArrayList<Employee>records, ArrayList<Employee>special){
        HashSet<Employee> set= new HashSet<Employee>(records);
        ArrayList<Employee> originalRec = new ArrayList<Employee>(set);
        records.clear();
        records.addAll(originalRec);
    }
}
