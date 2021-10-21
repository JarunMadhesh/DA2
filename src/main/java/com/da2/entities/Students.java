package com.da2.entities;

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
    public String aiming_for;

    public Students(JSONObject stud) {
        skillSet = new ArrayList<>();
        interest = new ArrayList<>();
        futurePlan = new ArrayList<>();
        recommended_companies = new ArrayList<>();

        studentName = (String) stud.get("name");
        JSONArray skills = (JSONArray) stud.get("skillset");
        for(Object s : skills) {
            this.skillSet.add((String) s);
        }
        JSONArray interest = (JSONArray) stud.get("interest");
        for(Object s : interest) {
            this.interest.add((String) s);
        }
        JSONArray future_plans = (JSONArray) stud.get("future_plans");
        for(Object f : future_plans) {
            this.futurePlan.add((String) f);
        }
        if(stud.get("aiming_for") != null) {
            this.aiming_for = (String) stud.get("aiming_for");
        }
    }

}
