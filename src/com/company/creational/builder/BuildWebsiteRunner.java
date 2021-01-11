package com.company.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new EnterpriseWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);

        director.setBuilder(new VisitCardWebsite());

        website = director.buildWebsite();

        System.out.println(website);
    }
}
