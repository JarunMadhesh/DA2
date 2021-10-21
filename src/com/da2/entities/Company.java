package com.da2.entities;

import com.da2.helpers.Enums;

import java.util.ArrayList;
import java.util.HashMap;

public class Company {

    public String companyName;
    public final ArrayList<Enums.domain> domain;
    public Enums.offer offers;
    public long pay;
    public boolean isInternshipProvided;
    public long probation_period;
    public long annual_increment;

    public Company() {
        domain = new ArrayList<Enums.domain>();
    }


}
