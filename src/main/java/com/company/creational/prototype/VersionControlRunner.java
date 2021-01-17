package com.company.creational.prototype;

import java.util.concurrent.atomic.AtomicLong;

public class VersionControlRunner {
    static AtomicLong atomicLong = new AtomicLong(1000);
    public static void main(String[] args) {
        Project master = new Project(atomicLong.getAndIncrement(), "SuperProject", "SourceCode source = new SourceCode();");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n=======================\n");
        System.out.println(masterClone);
    }
}
