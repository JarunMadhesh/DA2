package com.da2.entities;

import com.da2.helpers.Enums;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


public class Students {

    public String studentName;
    public final ArrayList<String> skillSet;
    public final ArrayList<String> interest;
    public final ArrayList<String> futurePlan;

    public final ArrayList<Company> recommended_companies;

    public Students(JSONObject stud) {
        skillSet = new ArrayList<String>();
        interest = new ArrayList<String>();
        futurePlan = new ArrayList<String>();
        recommended_companies = new ArrayList<Company>();


        studentName = (String) stud.get("name");
        JSONArray skills = (JSONArray) stud.get("skillset");
        for(Object s : skills) {
            skillSet.add((String) s);
        }
        JSONArray future_plans = (JSONArray) stud.get("future_plans");
        for(Object f : future_plans) {
            futurePlan.add((String) f);
        }
    }

}
