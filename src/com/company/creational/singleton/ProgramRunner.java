package com.company.creational.singleton;

import java.sql.SQLOutput;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log ...");
        ProgramLogger.getProgramLogger().addLogInfo("Second log ...");
        ProgramLogger.getProgramLogger().addLogInfo("Third log ...");

        ProgramLogger.getProgramLogger().showLogFle();
    }
}
