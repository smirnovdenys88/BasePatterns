package com.company.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> DEVELOPERS = new HashMap<>();

    public Developer getDeveloperBySpecialty(Specialty specialty) {
        Developer developer = DEVELOPERS.get(specialty.name());

        if (developer == null) {
            switch (specialty.name()) {
                case "JAVA":
                    developer = new JavaDeveloper();
                    break;
                case "PHP":
                    developer = new PhpDeveloper();
                    break;
                case "CPP":
                    developer = new CppDeveloper();
                    break;
            }
        }
        return developer;
    }
}
