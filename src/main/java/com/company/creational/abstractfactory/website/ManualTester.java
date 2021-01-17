package com.company.creational.abstractfactory.website;

import com.company.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tests website...");
    }
}
