package com.company.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        //Java dev
        developers.add(factory.getDeveloperBySpecialty(Specialty.JAVA));
        developers.add(factory.getDeveloperBySpecialty(Specialty.JAVA));

        //C++ dev
        developers.add(factory.getDeveloperBySpecialty(Specialty.CPP));
        developers.add(factory.getDeveloperBySpecialty(Specialty.CPP));
        developers.add(factory.getDeveloperBySpecialty(Specialty.CPP));

        //PHP dev
        developers.add(factory.getDeveloperBySpecialty(Specialty.PHP));
        developers.add(factory.getDeveloperBySpecialty(Specialty.PHP));

        //Run work...
        developers.forEach(d ->d.writeCode());
    }
}
