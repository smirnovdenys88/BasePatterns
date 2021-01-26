package com.company.creational.abstractfactory.projects;

import com.company.creational.abstractfactory.Developer;
import com.company.creational.abstractfactory.ProjectManager;
import com.company.creational.abstractfactory.ProjectTeamFactory;
import com.company.creational.abstractfactory.Tester;
import com.company.creational.abstractfactory.website.WebsiteTeamFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AuctionSiteProjectTest {

    @Test
    public void createTeamForWebsiteProject() {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        assertNotEquals(null, developer);
        assertNotEquals(null, tester);
        assertNotEquals(null, projectManager);

        assertEquals(projectTeamFactory.getClass(), WebsiteTeamFactory.class);
    }
}