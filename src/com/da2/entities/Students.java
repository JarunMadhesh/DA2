package com.da2.entities;

import com.da2.helpers.Enums;

import java.util.ArrayList;
import java.util.HashMap;


public class Students {

    public String studentName;
    public final HashMap<Enums.skillSet , Long> skillSet;
    public final ArrayList<Enums.interest> interest;
    public final ArrayList<Enums.future_plan> futurePlan;

    public final ArrayList<Company> recommended_companies;

    public Students() {
        skillSet = new HashMap<Enums.skillSet, Long>();
        interest = new ArrayList<Enums.interest>();
        futurePlan = new ArrayList<Enums.future_plan>();
        recommended_companies = new ArrayList<Company>();
    }

}
