package com.company.creational.abstractfactory.website;

import com.company.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages Website project...");
    }
}
