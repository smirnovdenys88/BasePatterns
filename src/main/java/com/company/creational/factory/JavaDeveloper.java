package com.company.creational.factory;

public class JavaDeveloper implements Developer {
    private String message = "JavaDeveloper is writing code ...";
    @Override
    public String writeCode() {
        return getMessage();
    }

    public String getMessage() {
        return message;
    }
}
