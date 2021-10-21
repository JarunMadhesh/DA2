package com.da2.helpers;

import com.da2.entities.Company;
import com.da2.entities.Students;
import com.da2.helpers.Enums;

import java.util.ArrayList;

public class Setup {


    public ArrayList<Students> setupStudents() {
        ArrayList<Students> students = new ArrayList<>();

        Students student1 = new Students();
        student1.studentName = "Aravind";
        student1.skillSet.put(Enums.skillSet.Android_development, 5L);
        student1.skillSet.put(Enums.skillSet.machine_learning, 5L);
        student1.futurePlan.add(Enums.future_plan.placement);

        students.add(student1);

        Students student2 = new Students();
        student2.studentName = "Abhishek";
        student2.skillSet.put(Enums.skillSet.website_development, 5L);
        student2.skillSet.put(Enums.skillSet.blockchain, 5L);
        student2.futurePlan.add(Enums.future_plan.placement);
        students.add(student2);


        Students student3= new Students();
        student3.studentName = "Jarun Madhesh";
        student3.skillSet.put(Enums.skillSet.deep_learning, 5L);
        student3.skillSet.put(Enums.skillSet.reinforcement_learning, 5L);
        student3.futurePlan.add(Enums.future_plan.internship);
        students.add(student3);

        Students student4= new Students();
        student4.studentName = "Mohana Ganesh";
        student4.skillSet.put(Enums.skillSet.deep_learning, 5L);
        student4.skillSet.put(Enums.skillSet.reinforcement_learning, 5L);
        student4.futurePlan.add(Enums.future_plan.higherStudies);
        students.add(student4);

        return(students);
    }

    public ArrayList<Company> setUpCompanies() {
        ArrayList<Company> companies = new ArrayList<>();

        Company company1 = new Company();
        company1.companyName = "HCI";
        company1.domain.add(Enums.domain.Android_development);
        company1.domain.add(Enums.domain.blockchain);
        company1.offers = Enums.offer.placement;
        companies.add(company1);

        Company company2 = new Company();
        company2.companyName = "Infosys";
        company2.domain.add(Enums.domain.blockchain);
        company2.domain.add(Enums.domain.reinforcement_learning);
        company2.offers = (Enums.offer.internship);
        companies.add(company2);

        Company company3 = new Company();
        company3.companyName = "Zoho";
        company3.domain.add(Enums.domain.website_development);
        company3.domain.add(Enums.domain.Android_development);
        company3.domain.add(Enums.domain.deep_learning);
        company3.offers = (Enums.offer.internship);
        companies.add(company3);

        Company company4 = new Company();
        company4.companyName = "Zoho";
        company4.domain.add(Enums.domain.website_development);
        company4.domain.add(Enums.domain.Android_development);
        company4.domain.add(Enums.domain.deep_learning);
        company4.offers = (Enums.offer.placement);
        companies.add(company4);

        return(companies);
    }


    public Setup(){}
}
