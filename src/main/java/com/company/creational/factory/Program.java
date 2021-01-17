package com.company.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory factory = createDeveloperBySpecialty(DeveloperSpecialty.JAVA);
        Developer developer = factory.createDeveloper();

        System.out.println(developer.writeCode());
    }

    public static DeveloperFactory createDeveloperBySpecialty(DeveloperSpecialty specialty) {
        switch (specialty) {
            case JAVA:
                return new JavaDeveloperFactory();
            case CPP:
                return new CppDeveloperFactory();
            default:
                throw new RuntimeException(specialty + "is unknown specialty");
        }
    }
}
