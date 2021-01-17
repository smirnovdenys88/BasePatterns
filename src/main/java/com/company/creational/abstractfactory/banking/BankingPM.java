package com.company.creational.abstractfactory.banking;

import com.company.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM manages bamking project...");
    }
}
