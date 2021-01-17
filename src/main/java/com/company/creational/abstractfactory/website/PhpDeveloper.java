package com.company.creational.abstractfactory.website;

import com.company.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes code...");
    }
}
