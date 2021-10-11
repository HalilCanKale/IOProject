package com.spart.io.Model;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateScan {

    public static void duplicateDetection(ArrayList<Employee>records, ArrayList<Employee>special){
        HashSet<Employee> set= new HashSet<Employee>(records);
        ArrayList<Employee> originalRec = new ArrayList<Employee>(set);
        records.clear();
        records.addAll(originalRec);
        special.addAll(originalRec);
        special.removeAll(set);
    }
}
