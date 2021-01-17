package com.company.creational.abstractfactory.banking;

import com.company.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
