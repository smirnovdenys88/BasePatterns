package com.company.creational.abstractfactory.projects;

import com.company.creational.abstractfactory.Developer;
import com.company.creational.abstractfactory.ProjectManager;
import com.company.creational.abstractfactory.ProjectTeamFactory;
import com.company.creational.abstractfactory.Tester;
import com.company.creational.abstractfactory.banking.BankingTeamFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperBankSystemTest {

    @Test
    public void createTeamForBankProject() {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Creating bank system....");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

        assertNotEquals(null, developer);
        assertNotEquals(null, tester);
        assertNotEquals(null, projectManager);
        assertEquals(teamFactory.getClass(), BankingTeamFactory.class);
    }
}