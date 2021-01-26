package com.company.structural.bridge;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramCreatorTest {
    private static List<Program> programs = new ArrayList<>();

    @BeforeAll
    public static void init(){
        programs = Arrays.asList(
                new WebSite(new LayoutDeveloper()),
                new StockExchange(new CppDeveloper()),
                new BankSystem(new JavaDeveloper())
        );
    }

    @Test
    public void testPattenBridge(){
        assertEquals(programs.get(0).developer.getClass(), LayoutDeveloper.class);
        assertEquals(programs.get(1).developer.getClass(), CppDeveloper.class);
        assertEquals(programs.get(2).developer.getClass(), JavaDeveloper.class);

        assertNotEquals(programs.stream()
                .filter(p -> p.developer.getClass().equals(LayoutDeveloper.class))
                .findFirst().get()
                .developer.writeCode(), "Java developer writes Java code ...");
    }
}