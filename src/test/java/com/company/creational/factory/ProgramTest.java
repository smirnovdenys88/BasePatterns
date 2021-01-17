package com.company.creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgramTest extends Assertions{

    @Test
    public void factoryPatternWorkAsExpect(){
        DeveloperFactory factory = Program.createDeveloperBySpecialty(DeveloperSpecialty.JAVA);
        Developer developer = factory.createDeveloper();

        JavaDeveloper expectDeveloper = new JavaDeveloper();

        //expect class Developer
        assertEquals(factory.createDeveloper().getClass(), expectDeveloper.getClass());

        //expect message
        assertEquals(expectDeveloper.getMessage(), developer.writeCode());
    }
}