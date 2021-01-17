package com.company.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramRunnerTest {

    @Test
    public void singletonPatternWorkAsExpect(){
        ProgramLogger.getProgramLogger().addLogInfo("1");
        ProgramLogger.getProgramLogger().addLogInfo("2");

        String testline = "This is log file.\n\n1\n2\n";
        assertEquals(testline, ProgramLogger.getProgramLogger().showLogFile());

        assertEquals(ProgramLogger.getProgramLogger().hashCode(), ProgramLogger.getProgramLogger().hashCode());
    }
}