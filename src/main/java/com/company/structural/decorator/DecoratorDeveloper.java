package com.company.structural.decorator;

public class DecoratorDeveloper implements Developer {
    Developer developer;

    public DecoratorDeveloper(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
