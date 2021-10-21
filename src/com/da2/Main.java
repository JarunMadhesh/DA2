package com.da2;

import com.da2.entities.Company;
import com.da2.entities.Students;
import com.da2.helpers.Setup;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<Students>();
        ArrayList<Company> companies = new ArrayList<Company>();

        students = new Setup().setupStudents();
        companies = new Setup().setUpCompanies();


        Cac cac = new Cac();
        cac.recommendCompanies(students, companies);

    }
}
