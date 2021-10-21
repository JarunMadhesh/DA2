package com.da2.helpers;

import com.da2.entities.Company;
import com.da2.entities.Students;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;

public class Setup {


    public ArrayList<Students> setupStudents(JSONObject obj) {
        ArrayList<Students> students = new ArrayList<>();
        JSONArray studentArray = (JSONArray) obj.get("students");

        for(Object o: studentArray) {
            JSONObject stud = (JSONObject) o;
            Students temp = new Students(stud);
            students.add(temp);
        }

        return(students);
    }

    public ArrayList<Company> setUpCompanies(JSONObject obj) {
        ArrayList<Company> companies = new ArrayList<>();
        JSONArray companyArray = (JSONArray) obj.get("companies");

        for(Object o: companyArray) {
            JSONObject comp = (JSONObject) o;
            Company company = new Company(comp);
            companies.add(company);
        }
        return(companies);
    }


    public Setup(){}
}
