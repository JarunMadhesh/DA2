package com.da2.entities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class Company {

    public String companyName;
    public String domain;
    public String offers;
    public long pay;
    public long probation_period;
    public long annual_increment;
    public long founding_year;

    public Company(JSONObject comp) {

        this.companyName = (String) comp.get("name");
        this.offers = (String) comp.get("offers");
        this.domain = (String) comp.get("domain");
        this.pay = (Long) comp.get("pay");
        this.founding_year = (Long) comp.get("founding_year");
        if(comp.get("annual_increment") != null) {
            this.annual_increment = (Long) comp.get("annual_increment");
        } else {
            this.annual_increment = 0L;
        }
        if(comp.get("probation_period") != null) {
            this.probation_period = (Long) comp.get("probation_period");
        } else {
            this.probation_period = 0L;
        }
    }


}
