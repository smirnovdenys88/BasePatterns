package com.company.creational.abstractfactory.website;

import com.company.creational.abstractfactory.Developer;
import com.company.creational.abstractfactory.ProjectManager;
import com.company.creational.abstractfactory.ProjectTeamFactory;
import com.company.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
