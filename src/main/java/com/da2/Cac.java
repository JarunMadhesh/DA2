package com.da2;

import com.da2.entities.Company;
import com.da2.entities.Students;
import com.da2.helpers.Enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Cac {

    public void recommendCompanies(ArrayList<Students> students, ArrayList<Company> companies) {

        for(Students s : students) {
            System.out.println("Companies recommended for "+ s.studentName);
            System.out.println("\tSkillSet: "+ s.skillSet);
            System.out.println("\tLooking for: "+ s.futurePlan);
            for(Company c :companies) {
                boolean isFuturePlansForMatches = false;
                for(Object x : s.futurePlan) {
                    if(Objects.equals(x, c.offers)) {
                        isFuturePlansForMatches = true;
                        break;
                    }
                }

                if(isFuturePlansForMatches) {
                    boolean isDomainMatch = false;

                    for(Object y : s.skillSet) {
                        if(Objects.equals(c.domain, y)) {
                            isDomainMatch = true;
                            break;
                        }
                    }

                    if(isDomainMatch) {
                        s.recommended_companies.add(c);
                    }
                }
            }

            if (s.recommended_companies.size() ==0 ) {
                // If the person is aiming for higher studies or civil services or start up only
                // and not internship or placement, they will not get any recommendation
                // so, they will be notified with this console message.
                if(s.futurePlan.contains("higherStudies")) {
                    System.out.println("There is no recommendation as you are aiming for higher studies.");
                } else if(s.futurePlan.contains("civilService")) {
                    System.out.println("There is no recommendation as you are aiming for civil services.");
                } else if(s.futurePlan.contains("startUp")) {
                    System.out.println("There is no recommendation as you are aiming for start up.");
                } else {
                    System.out.println("No recommendations found.");
                }
            } else {
                s.recommended_companies.sort((o1, o2) -> o1.pay+o1.annual_increment*3>o2.pay+o1.annual_increment*3?1:0);
            }

            for(Company c : s.recommended_companies) {
                System.out.println(c.companyName);
                System.out.println("\tProvides"+ c.offers + " in " + c.domain + " at Rs." + c.pay + " LPA ");
            }

            System.out.println();
        }

    }

    public Cac() {}
}
