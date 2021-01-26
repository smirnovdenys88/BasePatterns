package com.company.structural.bridge;

public class WebSite extends Program {

    protected WebSite(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Website develop in progress...");
        developer.writeCode();
    }
}
