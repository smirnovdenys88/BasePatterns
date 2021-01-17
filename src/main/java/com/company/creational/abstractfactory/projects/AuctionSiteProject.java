package com.company.creational.abstractfactory.projects;

import com.company.creational.abstractfactory.Developer;
import com.company.creational.abstractfactory.ProjectManager;
import com.company.creational.abstractfactory.ProjectTeamFactory;
import com.company.creational.abstractfactory.Tester;
import com.company.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Website system....");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
