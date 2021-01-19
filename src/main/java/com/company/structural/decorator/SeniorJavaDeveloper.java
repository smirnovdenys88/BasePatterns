package com.company.structural.decorator;

public class SeniorJavaDeveloper extends DecoratorDeveloper {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    private String makeCoderReview(){
        return " Make code review...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCoderReview();
    }
}
